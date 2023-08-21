package top.zhaoqw.study.creational.singleton.sinnnerclass;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 使用静态内部类的方式解决延迟加载，和并发安全问题，推荐这种写法。
 * SingletonHolder 是一个静态内部类，当外部类 IdGenerator 被加载的时候，并不会创建
 * SingletonHolder 实例对象。只有当调用 getInstance() 方法时，SingletonHolder才会被加载，这个时候才会创建 instance。
 * instance 的唯一性、创建过程的线程安全性，都由 JVM来保证。所以，这种实现方法既保证了线程安全，又能做到延迟加载。
 */
public class IdGenerator {
  private AtomicLong id = new AtomicLong(0);
  private IdGenerator() {}
  private static class SingletonHolder{
    private static final IdGenerator instance = new IdGenerator();
  }
  
  public static IdGenerator getInstance() {
    return SingletonHolder.instance;
  }
 
  public long getId() { 
    return id.incrementAndGet();
  }
}