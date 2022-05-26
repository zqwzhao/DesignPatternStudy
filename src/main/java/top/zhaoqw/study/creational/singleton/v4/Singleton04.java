package top.zhaoqw.study.creational.singleton.v4;

/**
      懒汉式：
        对getInstance方法加锁，保证线程安全
        但是加Synchronized带来了效率下降
 */
public class Singleton04 {
    private static Singleton04 INSTANCE;

    private Singleton04() {}
    //static 则synchronized 锁的是Singleton04.class
    public static synchronized Singleton04 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton04();
            try{
                Thread.sleep(10);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return INSTANCE;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton04.getInstance().hashCode());
                }
            }).start();

        }
    }
}
