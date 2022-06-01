package top.zhaoqw.study.creational.simplefactory.action2.v2.store.impl;

import top.zhaoqw.study.creational.simplefactory.action2.v2.store.ICommodity;

/**
 * @author zhaoqw
 * @date 2022/06/01
 */
public class StoreFactory {
  public ICommodity getCommodityService(Integer commodityType) {
    if (null == commodityType) return null;
    if (CommodityTypeContant.COUPON_COMMODITY == commodityType){
      return new CouponCommodityService();
    }
    if (CommodityTypeContant.CARD_COMMODITY == commodityType) {
      return new CardCommodityService();
    }
    if (CommodityTypeContant.GOODS_COMMODITY == commodityType) {
      return new GoodsCommodityService();
    }
    throw new RuntimeException("不存在此商品类型");
  }
}
