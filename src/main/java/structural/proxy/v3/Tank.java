package structural.proxy.v3;


import java.util.Random;

/**
 * 解决方案2: 不能修改源码，使用继承的方式解决
 * 但是可能会导致继承层次过深，比如你又要记录日志，又需要继承一次TankTime
 * 继承层次不深，且没有接口,我们可以采用继承
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
    TankTime tank = new TankTime();
    tank.move();
  }
}

class TankTime extends Tank{

  @Override
  public void move() {
    long start = System.currentTimeMillis();
    super.move();
    long end = System.currentTimeMillis();
    System.out.println(end - start);
  }
}
