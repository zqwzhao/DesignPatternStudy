package top.zhaoqw.study.creational.singleton.v3;

/**
 * 懒汉式的特点：
 *     * 懒加载
 *     * 线程不安全
 *     * 易实现
 *     描述：没有加锁 synchronized，不要求线程安全，在多线程不能正常工作。
 *
 */
public class Singleton03 {
    private static Singleton03 INSTANCE;
    private Singleton03 (){}

    public static Singleton03 getInstance() {
    if ( INSTANCE == null) {
        INSTANCE = new Singleton03();
    }
    return  INSTANCE;
    }

    public static void main(String[] args) {
        //测试线程安全
        for (int i = 0; i < 200; i++) {
            new Thread(() ->{
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Singleton03.getInstance().hashCode());
            }).start();
        }
    }
}
