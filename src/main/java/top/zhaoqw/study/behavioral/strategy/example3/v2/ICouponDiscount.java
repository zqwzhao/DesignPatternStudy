package top.zhaoqw.study.behavioral.strategy.example3.v2;

import java.math.BigDecimal;

/**
 * v1 重构
 *
 * 折扣策略
 * @author zhaoqw
 * @date 2022/08/02
 */
public interface ICouponDiscount<T> {

  /**
   * 折扣实现类
   *
   * @param couponInfo 折扣信息
   * @param skuPrice 商品金额
   * @return 打折后价格
   */
  BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice);
}
