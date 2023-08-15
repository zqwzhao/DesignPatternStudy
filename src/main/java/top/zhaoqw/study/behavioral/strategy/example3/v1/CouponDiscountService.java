package top.zhaoqw.study.behavioral.strategy.example3.v1;

/**
 * 优惠券折扣计算接口
 *
 *  优惠券类型；
 *  1. 直减券
 *  2. 满减券
 *  3. 折扣券
 *  4. n元购
 * @author zhaoqw
 * @date 2022/08/02
 */
public class CouponDiscountService {
  /**
   * 打折方法
   * @param type 折扣类型
   * @param typeCount 优惠卷金额，或者折扣率
   * @param skuPrice 商品金额
   * @param typeExt 执行器
   * @return 实际价格
   */
  public double discountAmount(int type, double typeCount, double skuPrice, double typeExt) {
    // 直减
    if (1 == type) {
      return skuPrice - typeCount;
    }

    // 满减卷
    if (2 == type) {
      if (skuPrice < typeCount) return skuPrice;
      return skuPrice - typeCount;
    }

    // 折扣卷
    if (3 == type) {
      return skuPrice * typeCount;
    }

    // n 元卷
    if (4 == type) {
      return typeCount;
    }

    /**
     * 最开始可能是一个最简单的优惠券，
     * 后面随着产品功能的增加，不断的扩展if语句。实际的代码可能要比这个多很多
     */
    return 0D;
  }
}
