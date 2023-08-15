package top.zhaoqw.study.behavioral.observer;

/**
 * @author zhaoqw
 * @date 2023/04/25
 */
public class CpuObserver extends Observer{

    public CpuObserver(PcServer pcServer) {
        this.pcServer = pcServer;
        this.pcServer.addObserver(this);
    }

    @Override
    public void update() {
        if (pcServer.getCpu() > 80) {
            System.out.println("CPU占用过大...............");
        }
    }
}
