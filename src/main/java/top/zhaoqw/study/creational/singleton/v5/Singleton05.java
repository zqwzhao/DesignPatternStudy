package top.zhaoqw.study.creational.singleton.v5;

/**
 *  保证一个类只有一个对象实例
 *
 *   双重检查单例模式
 *   要不要加volatile，答案是要加，至少现在版本要加，因为大多数用的Java8
 *   高版本进行了优化
 */
public class Singleton05 {
    private /*volatile*/ static Singleton05 INSTANCE;
    private Singleton05() {}

    public static Singleton05 getInstance() {

        if (INSTANCE == null) {
            //双重检查
            synchronized (Singleton05.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton05();
                }
            }
        }
        return INSTANCE;
    }

}
