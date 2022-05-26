package top.zhaoqw.study.creational.simplefactory.action2.v1;

/**
 * 案例：模拟一个营销场景的发奖策略
 * 有三类奖品：
 *  优惠券
 *  实物商品
 *  第三⽅爱奇艺兑换卡
 *  随着后续的业务的发展，会新增其他种商品类型
 *
 *  第一种做法就是很容易能够想到的if/else
 * @author zhaoqw
 * @date 2022/05/26
 */
public class PrizeController {
  private static Integer type = 1;

  public static void main(String[] args) {
    if (type == 1) {
      //发第一种奖品
      // 若干业务代码....
      System.out.println("发第一种奖品");
    }else if (type == 2) {
      // 若干业务代码....
      System.out.println("发第二种奖品");
    }else {
      // 若干业务代码....
      System.out.println("发第三种奖品");
    }
    // 代码行数多，业务杂糅多，理解困难，维护困难
  }
}
