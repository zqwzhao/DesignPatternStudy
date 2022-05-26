package top.zhaoqw.study.refactor.exercise01.v3;

import com.google.common.annotations.VisibleForTesting;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

/**
 *
 * 随机id生成器 利用主机名+系统时间+随机6位字符(数字+字母组成)
 * @author: zhaoqw
 * @date: 2022/1/11 16:04
 *  getLastfieldOfHostName 中的InetAddress.getLocalHost()
 *
 *
 *  在获取主机名失败的时候，generate函数应该能正常返回，因为是随机id，
 *  所以只要有个满足要求的id就行了，用户并不关心能不能拿到主机名字，
 *  所以在获取主机名失败的时候，可以返回一个默认的主机名，
 *  之后在拼接上时间戳和随机数也是满足需求的id，所以我认为generate函数在主机名失败的时候应该使用默认主机名正常返回。
 */
public class RandomIdGenerator implements LogTraceIdGenerator {
    //private static final Logger logger = LoggerFactory.getLogger(RandomIdGenerator.class);
    /**
     *
     * 使用案例:
     *  RandomIdGenerator idGenerator = new RandomIdGenerator();
     *  String randomId = idGenerator.generate();
     *  你也可以用依赖注入的方式进行使用
     * @return 生成随机id字符串 主机名+系统时间+随机6位字符(数字+字母组成)
     */
    @Override
    public String generate() {
        String substrOfHostName = getLastfieldOfHostName();
        long currentTimeMillis = System.currentTimeMillis();
        String randomString = generateRandomAlphameric(8);
        String id = String.format("%s-%d-%s",
                substrOfHostName, currentTimeMillis, randomString);
        return id;
    }

    /**
     * 获取主机名
     * 利用 InetAddress.getLocalHost().getHostName()获取主机名
     * @return
     */
    private String getLastfieldOfHostName() { //如果需求经常变化的话，可以命名为 getLastField()
        String substrOfHostName = null;
        try {
            String hostName = InetAddress.getLocalHost().getHostName();
            substrOfHostName = getLastSubstrSplittedByDot(hostName);
        } catch (UnknownHostException e) {
            e.printStackTrace();
            //打日志
        }
        return substrOfHostName;
    }

    /**
     * 获取主机名最后一部分
     * 例如:
     * aaa.bbb.ccc.apple 只取 apple
     * @param hostName
     * @return
     */
    @VisibleForTesting
    protected String getLastSubstrSplittedByDot(String hostName) {
        //如果需求经常变化，命名为getLastSubstrByDelimiter

        String[] tokens = hostName.split("\\.");
        String substrOfHostName = tokens[tokens.length - 1];
        return substrOfHostName;
    }

    /**
     * 生成一个由数字字母组成的六位随机id
     * @param length 随机id的长度
     * @return 随机id
     */
    @VisibleForTesting
    protected String generateRandomAlphameric(int length) {
        char[] randomChars = new char[length];
        int count = 0;
        Random random = new Random();
        while (count < length) {
            int maxAscii = 'z';
            int randomAscii = random.nextInt(maxAscii);
            boolean isDigit= randomAscii >= '0' && randomAscii <= '9';
            boolean isUppercase= randomAscii >= 'A' && randomAscii <= 'Z';
            boolean isLowercase= randomAscii >= 'a' && randomAscii <= 'z';
            if (isDigit|| isUppercase || isLowercase) {
                randomChars[count] = (char) (randomAscii);
                ++count;
            }
        }
        return new String(randomChars);
    }

    public static void main(String[] args) {
        RandomIdGenerator randomIdGenerator = new RandomIdGenerator();
        for (int i = 0; i < 100; i++) {
            System.out.println(randomIdGenerator.generate());
        }

    }
}
