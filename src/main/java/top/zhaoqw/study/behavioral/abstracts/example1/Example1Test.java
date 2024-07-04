package top.zhaoqw.study.behavioral.abstracts.example1;

/**
 * @author zhaoqw
 * @date 2024/7/4
 */
public class Example1Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.command("海报图", new Leader());
        boss.command("爬虫", new Leader());
        boss.command("卖手机", new Leader());
    }
}
