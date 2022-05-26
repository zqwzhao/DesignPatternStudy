package top.zhaoqw.study.structural.proxy.v4;


import java.util.Random;

/**
 * 解决方案3: 不能修改源码，用组合代替继承
 * 组合也有缺陷，如果又要记录日志，又要保证单一职责，不能在TankTime再组合一个什么TankLog之类的
 * 要保证它单一职责，
 * 有什么方法解决这个问题呢？ 使用代理模式
 * @author: zhaoqw
 * @date: 2022/3/9 09:34
 */
public class Tank implements Movable {

  @Override
  public void move() {
    System.out.println("Tank moving ......................................");
    try {
      Thread.sleep(new Random().nextInt(10000));
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    long end = System.currentTimeMillis();

  }

  public static void main(String[] args) {
    TankTime tank = new TankTime(new Tank());
    tank.move();
  }
}

class TankTime {
  Movable move;
  public TankTime(Movable move) {
    this.move = move;
  }

  public void move() {
    long start = System.currentTimeMillis();
    move.move();
    long end = System.currentTimeMillis();
    System.out.println(end - start);
  }
}
