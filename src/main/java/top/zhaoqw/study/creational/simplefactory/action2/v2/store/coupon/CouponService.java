package top.zhaoqw.study.creational.simplefactory.action2.v2.store.coupon;

/**
 * 发奖的Service 负责实际的发奖服务
 *
 * @author zhaoqw
 * @date 2022/05/27
 */
public class CouponService {
  public CouponResult sendCoupon(String uId, String couponNumber, String uuid) {
    System.out.println("模拟发放优惠券一张：" + uId + "," + couponNumber + "," + uuid);
    return new CouponResult("0000", "发放成功");
  }
}
