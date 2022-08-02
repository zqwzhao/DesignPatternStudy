package top.zhaoqw.study.behavioral.strategy.example3.v2;

import java.math.BigDecimal;
import java.util.Map;

/**
 * 满减卷接口实现
 *
 * @author zhaoqw
 * @date 2022/08/02
 */
public class MJCouponDiscount implements ICouponDiscount<Map<String, String>>{

  /**
   * 满减方法实现
   * 1.判断满足 X元的话 -n元
   * 2.最低支付1元
   */
  @Override
  public BigDecimal discountAmount(Map<String, String> couponInfo, BigDecimal skuPrice) {
    //满减金额
    String x = couponInfo.get("x");
    // 满减去减多少钱
    String n = couponInfo.get("n");

    // 商品金额 小于 满减金额 直接返回商品金额
    if (skuPrice.compareTo(new BigDecimal(x)) < 0) return skuPrice;

    BigDecimal disCountPrice = skuPrice.subtract(new BigDecimal(n));
    if (disCountPrice.compareTo(BigDecimal.ZERO) < 1) return BigDecimal.ONE;

    return disCountPrice;
  }
}
