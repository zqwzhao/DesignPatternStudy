package top.zhaoqw.study.creational.abstractfactory.v1;

public class BlackHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黑种人会笑...............");
    }

    @Override
    public void cry() {
        System.out.println("黑种人会哭...............");
    }

    @Override
    public void talk() {
        System.out.println("黑种人会说话...............");
    }

}
