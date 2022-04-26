package creational.singleton.action.idgenerate.v1;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class IdGenerator {
    // AtomicLong是一个Java并发库中提供的一个原子变量类型，
    //它将一些线程不安全需要加锁的复合操作封装为了线程安全的原子操作，//比如下面会用到的incrementAndGet() .
    private AtomicLong id = new AtomicLong(10000);
    private static final IdGenerator INSTANCE = new IdGenerator();
    private IdGenerator() {
    }

    public static IdGenerator getInstance() {
        return INSTANCE;
    }

    public long getId() {
        return id.getAndAdd(new Random().nextInt(10));
    }
    public long generate() {
        return id.getAndAdd(new Random().nextInt(10));
    }

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4,8,5, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(10),new ThreadPoolExecutor.DiscardOldestPolicy());
        for (int i = 0; i < 100; i++) {
            threadPoolExecutor.submit(() -> {
                IdGenerator instance = IdGenerator.getInstance();
                for (int i1 = 0; i1 < 100; i1++) {
                    System.out.println(instance.getId());
                }
            });
        }

        threadPoolExecutor.shutdown();
    }
}
