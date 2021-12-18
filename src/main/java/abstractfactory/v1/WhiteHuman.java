package abstractfactory.v1;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-12-02 11:41]
 */
public class WhiteHuman implements Human {

    @Override
    public void laugh() {
        System.out.println("白种人会笑...............");
    }

    @Override
    public void cry() {
        System.out.println("白种人会哭...............");
    }

    @Override
    public void talk() {
        System.out.println("白种人会说话...............");
    }
}
