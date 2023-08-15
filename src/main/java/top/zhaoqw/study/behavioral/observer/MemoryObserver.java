package top.zhaoqw.study.behavioral.observer;

/**
 * @author zhaoqw
 * @date 2023/04/25
 */
public class MemoryObserver extends Observer{

    public MemoryObserver(PcServer pcServer) {
        this.pcServer = pcServer;
        this.pcServer.addObserver(this);
    }

    @Override
    public void update() {
        if (pcServer.getMemory() > 80) {
            System.out.println("内存占用过大...............");
        }
    }
}
