package proxy.v5;

import java.util.Random;

/**
 * 在执行Tank的move方法过程中想要做一些其他的事情
 * 问题：我想记录坦克的移动时间
 * 最简单的办法：修改代码，记录时间
 * 问题2：如果无法改变方法源码呢？
 * 用继承？ 如果需要做很多很多不同的事，需要用到很多层
 * 使用代理，代理有各种类型  组合类型用接口或者父类，代替子类
 * 问题：如何实现代理的各种组合？继承？Decorator?
 * v07:代理的对象改成Movable类型-越来越像decorator了
 *
 */
public class Tank implements Movable {

    /**
     * 模拟坦克移动了一段儿时间
     */
    @Override
    public void move() {
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Tank t = new Tank();
        TankTimeProxy ttp = new TankTimeProxy(t);
        TankLogProxy tlp = new TankLogProxy(ttp);
        tlp.move();

        new TankLogProxy(
                new TankTimeProxy(
                        new Tank()
                )
        ).move();
    }
}

/**
代理理类 TankTimeProxy 和原始类 Tank 实现相同的接口 Moveable。
Tank 类只负责业务功能。代理类 TankTimeProxy 负责在业务代码执行前后附加其他逻辑代码，
并通过委托的方式调用原始类来执行业务代码。
*/
class TankTimeProxy implements Movable {
    Movable m;

    public TankTimeProxy(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        m.move();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

class TankLogProxy implements Movable {
    Movable m;

    public TankLogProxy(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        System.out.println("start moving...");
        m.move();
        long end = System.currentTimeMillis();
        System.out.println("stopped!");
    }
}
