package top.zhaoqw.study.structural.proxy.v1;

import java.util.Random;

/**
 * 在执行Tank的move方法过程中想要做一些其他的事情
 * 问题1：我想记录坦克的移动时间, 记录日志
 * 该怎么办？
 * @author: zhaoqw
 * @date: 2022/3/9 09:19
 */
public class Tank implements Movable{

  @Override
  public void move() {
    System.out.println("Tank moving ......................................");
    try {
      Thread.sleep(new Random().nextInt(10000));
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    Tank tank = new Tank();
    tank.move();
  }
}
