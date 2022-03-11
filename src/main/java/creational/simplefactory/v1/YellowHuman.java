package creational.simplefactory.v1;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-12-02 11:40]
 */
public class YellowHuman implements Human{

    @Override
    public void laugh() {
        System.out.println("黄种人会笑...............");
    }

    @Override
    public void cry() {
        System.out.println("黄种人会哭...............");
    }

    @Override
    public void talk() {
        System.out.println("黄种人会说话...............");
    }
}
