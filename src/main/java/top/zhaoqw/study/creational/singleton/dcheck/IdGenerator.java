package top.zhaoqw.study.creational.singleton.dcheck;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 饿汉式不支持延迟加载，懒汉式有性能问题，不支持高并发。
 * 为了解决以上问题，就出现了双重检查的写法
 *
 *
 * 网上有说话说new过程中会出现，指令重排序，可能会导致 IdGenerator 对象被 new 出来，
 * 并且赋值给 instance之后，还没来得及初始化（执行构造函数中的代码逻辑），就被另一个线程使用了。
 *
 * 要解决这个问题，我们需要给 instance 成员变量加上 volatile 关键字，禁止指令重排序才行。
 * 实际上，只有很低版本的 Java才会有这个问题。我们现在用的高版本的 Java 已经在 JDK 内部实现中解决了这个问题
 * （解决的方法很简单，只要把对象 new操作和初始化操作设计为原子操作，就自然能禁止重排序）
 * @author zhaoqw
 * @date 2023/8/21
 */
public class IdGenerator {
    private AtomicLong id = new AtomicLong(0l);
    private static IdGenerator INSTANCE;
    /**
     * 私有化构造器
     */
    private IdGenerator() {}

    public static IdGenerator getInstance() {
        if (INSTANCE == null) {
            synchronized (IdGenerator.class) {
                if (INSTANCE == null) {
                    INSTANCE = new IdGenerator();
                }
            }
        }
        return INSTANCE;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
