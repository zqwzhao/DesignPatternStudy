package top.zhaoqw.study.creational.singleton.action.idgenerate.v1;

import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 线程唯一的单例，一个线程只能有一个单例对象
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-12-16 11:12]
 */
public class IdGenerator3 {
    private AtomicInteger id = new AtomicInteger(10000);

    private static final ConcurrentHashMap<Long, IdGenerator3> instances = new ConcurrentHashMap<>();

    private IdGenerator3() {}

    public static IdGenerator3 getInstance() {
        long currentThreadId = Thread.currentThread().getId();
        instances.putIfAbsent(currentThreadId, new IdGenerator3());
        return instances.get(currentThreadId);
    }

    public long getId() {
       return id.getAndAdd(new Random().nextInt(10));
    }

    public static void main(String[] args) {
        IdGenerator3 idGenerator3 = IdGenerator3.getInstance();
        for (int i = 0; i < 100; i++) {

            System.out.println(idGenerator3.getId());
        }
    }
}
