package top.zhaoqw.study.creational.singleton.enumimpl;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 枚举对象是单例的，一种对象只会在内存中保存一份。
 * 基于枚举类型的单例实现。这种实现方式通过 Java枚举类型本身的特性，
 * 是最简单实现单例的方式，保证了实例创建的线程安全性和实例的唯一性。
 *
 * 这也是Effective Java中推荐的一种方式，
 * 想一想，我们在项目中使用的表示状态的枚举就是这种写法
 */
public enum IdGenerator {
    INSTANCE;
    private AtomicLong id = new AtomicLong(0);
    public long getId() { 
        return id.incrementAndGet();
    }

    public static void main(String[] args) {
        IdGenerator instance = IdGenerator.INSTANCE;
        System.out.println(instance.getId());
    }
}