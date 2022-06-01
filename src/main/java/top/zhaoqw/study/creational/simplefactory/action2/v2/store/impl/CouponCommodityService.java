package top.zhaoqw.study.creational.simplefactory.action2.v2.store.impl;


import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.zhaoqw.study.creational.simplefactory.action2.v2.store.ICommodity;
import top.zhaoqw.study.creational.simplefactory.action2.v2.store.coupon.CouponResult;
import top.zhaoqw.study.creational.simplefactory.action2.v2.store.coupon.CouponService;

import java.util.Map;

/**
 * 实体奖品发奖接口
 *
 * @author zhaoqw
 * @date 2022/05/26
 */
public class CouponCommodityService implements ICommodity {
  private Logger logger = LoggerFactory.getLogger(CouponCommodityService.class);

  private CouponService couponService = new CouponService();

  /**
   * 发奖方法
   *
   * @param uId         用户id
   * @param commodityId 奖品id
   * @param bizId       业务id
   * @param extMap      扩展字段
   * @throws Exception 异常信息
   */
  @Override
  public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
    CouponResult couponResult = couponService.sendCoupon(uId, commodityId, bizId);
    logger.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}",
        uId, commodityId, bizId, JSON.toJSON(extMap));
    logger.info("测试结果[优惠券]：{}", JSON.toJSON(couponResult));
    if (!"0000".equals(couponResult.getCode())) {
      throw new RuntimeException(couponResult.getMessage());
    }
  }
}
