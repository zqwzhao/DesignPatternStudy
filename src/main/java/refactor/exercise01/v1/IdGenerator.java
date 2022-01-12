package refactor.exercise01.v1;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

/**
 * @author: zhaoqw
 * @date: 2022/1/11 13:55
 *
 *
 * 1. 基于实现而非基于接口，违反基于接口而非实现的编程思想
 * 2. 可读性较差，存在太多魔法数
 * 3. hostname 为空的情况
 * 4. 可测试性较差
 * 5. if重复过多
 */
public class IdGenerator {
    //private static final Logger logger = LoggerFactory.getLogger(IdGenerator.class);
    public static String generate() {
        String id = "";
        try {
            String hostName = InetAddress.getLocalHost().getHostName();
            String[] tokens = hostName.split("\\.");
            if (tokens.length > 0) {
                hostName = tokens[tokens.length - 1];
            }
            char[] randomChars = new char[8];
            int count = 0;
            Random random = new Random();
            while (count < 8) {
                int randomAscii = random.nextInt(122);
                if (randomAscii >= 48 && randomAscii <= 57) {
                    randomChars[count] = (char)('0' + (randomAscii - 48));
                    count++;
                } else if (randomAscii >= 65 && randomAscii <= 90) {
                    randomChars[count] = (char)('A' + (randomAscii - 65));
                    count++;
                } else if (randomAscii >= 97 && randomAscii <= 122) {
                    randomChars[count] = (char)('a' + (randomAscii - 97));
                    count++;
                }
            }
            id = String.format("%s-%d-%s", hostName,
                    System.currentTimeMillis(), new String(randomChars));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return id;
    }

    public static void main(String[] args) throws UnknownHostException {
        String generate = IdGenerator.generate();
        System.out.println(generate);
        System.out.println(InetAddress.getLocalHost().getHostName());
    }
}