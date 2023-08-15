package top.zhaoqw.study.creational.singleton.v1;

/**
 * 饿汉式的特点：
 *   * 线程安全
 *   * 没有懒加载
 *   * 容易实现，推荐使用
 * 唯一缺点：不关用到与否，类加载时就完成实例化
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-12-16 10:52]
 */
public class Singleton01 {
    //私有构造
    private Singleton01() {
    }

    private static Singleton01 INSTANCE = new Singleton01();


    public static Singleton01 getIstance() {
        return INSTANCE;
    }

    public void method() {
        //业务逻辑.....
    }
}
