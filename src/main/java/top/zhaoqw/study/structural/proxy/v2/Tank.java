package top.zhaoqw.study.structural.proxy.v2;


import java.util.Random;

/**
 * 在执行Tank的move方法过程中想要做一些其他的事情
 * 问题1：我想记录坦克的移动时间, 记录日志
 * 解决方案1: 能修改代码的情况下，加入相关代码
 * @author: zhaoqw
 * @date: 2022/3/9 09:25
 */
public class Tank implements Movable {

  @Override
  public void move() {
    long start = System.currentTimeMillis();
    System.out.println("Tank moving ......................................");
    try {
      Thread.sleep(new Random().nextInt(10000));
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    long end = System.currentTimeMillis();

    System.out.println(end - start);
  }

  public static void main(String[] args) {
    Tank tank = new Tank();
    tank.move();
  }
}
