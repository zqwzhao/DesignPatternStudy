package top.zhaoqw.study.behavioral.observer;

import java.util.Random;

/**
 * @author zhaoqw
 * @date 2023/04/25
 */
public class Client {
    public static void main(String[] args) {
        PcServer pcServer = new PcServer();
        new CpuObserver(pcServer);
        new MemoryObserver(pcServer);

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            pcServer.changeState(random.nextInt(100), random.nextInt(100));
        }
    }
}
