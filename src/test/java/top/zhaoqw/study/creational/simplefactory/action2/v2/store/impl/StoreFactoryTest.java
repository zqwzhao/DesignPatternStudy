package top.zhaoqw.study.creational.simplefactory.action2.v2.store.impl;

import org.junit.Test;
import top.zhaoqw.study.creational.simplefactory.action2.v2.store.ICommodity;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaoqw
 * @date 2022/06/01
 */
public class StoreFactoryTest {
  @Test
  public void testCommunity() throws Exception {
    // 优惠券
    ICommodity commodityService1 = new StoreFactory()
        .getCommodityService(CommodityTypeContant.COUPON_COMMODITY);
    commodityService1.sendCommodity("10001","EGSE100021","78844454784411", null);

    // 卡包
    ICommodity commodityService2 = new StoreFactory().
        getCommodityService(CommodityTypeContant.CARD_COMMODITY);
    commodityService2.sendCommodity("10002","EGAAEE20031","4851154544545", null);

    // 实物
    ICommodity commodityService3 = new StoreFactory()
        .getCommodityService(CommodityTypeContant.GOODS_COMMODITY);
    Map<String,String> extMap = new HashMap<String,String>();
    extMap.put("consigneeUsername", "谢⻜机");
    extMap.put("consigneeUserPhone", "15200292123");
    extMap.put("userAddress","安徽省滁州市天长市XX街道XX小区XX栋XX单元.#15-2253");
    commodityService3.sendCommodity("10003", "EGEEADD20034", "7878955556622", extMap);
  }
}
