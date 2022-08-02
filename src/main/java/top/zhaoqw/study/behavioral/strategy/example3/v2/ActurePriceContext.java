package top.zhaoqw.study.behavioral.strategy.example3.v2;

import java.math.BigDecimal;

/**
 * 策略控制类
 *
 * @author zhaoqw
 * @date 2022/08/02
 */
public class ActurePriceContext<T> {
  private ICouponDiscount<T> couponDiscount;

  public ActurePriceContext(ICouponDiscount<T> couponDiscount) {
    this.couponDiscount = couponDiscount;
  }

  public BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice) {
    return couponDiscount.discountAmount(couponInfo, skuPrice);
  }
}
