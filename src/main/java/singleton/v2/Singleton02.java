package singleton.v2;

/**
 * 饿汉式：
 * 静态代码块实现
 * 效果和SingleTon01一样
 */
public class Singleton02 {
    private static Singleton02 INSTANCE;
    private Singleton02() {
    }
    static{
        INSTANCE = new Singleton02();
    }
    

    public Singleton02 getIstance() {
        return INSTANCE;
    }

    public void method() {
        //.....
    }
}