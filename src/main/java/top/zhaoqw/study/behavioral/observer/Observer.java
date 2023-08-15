package top.zhaoqw.study.behavioral.observer;

/**
 * @author zhaoqw
 * @date 2023/04/25
 */
public abstract class Observer {
    protected PcServer pcServer;

    public abstract void update();
}
