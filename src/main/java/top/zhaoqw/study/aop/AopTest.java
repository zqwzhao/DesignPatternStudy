package top.zhaoqw.study.aop;

/**
 * @author zhaoqw
 * @date 2023/8/15
 */
public class AopTest {
    public static void main(String[] args) {
        OriginBean origin = new OriginBean();
        origin.name = "Bob";
        System.out.println(origin.hello());

        OriginBean proxy = new ProxyResolverByByteBuddy()
                .createProxy(origin, new PoliteInvocationHandler());
        System.out.println(proxy.hello());
        System.out.println(proxy.morning());
    }
}
