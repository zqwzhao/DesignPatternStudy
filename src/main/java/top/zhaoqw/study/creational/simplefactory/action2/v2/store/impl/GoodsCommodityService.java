package top.zhaoqw.study.creational.simplefactory.action2.v2.store.impl;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.zhaoqw.study.creational.simplefactory.action2.v2.store.ICommodity;
import top.zhaoqw.study.creational.simplefactory.action2.v2.store.goods.DeliverReq;
import top.zhaoqw.study.creational.simplefactory.action2.v2.store.goods.GoodsService;

import java.util.Map;

/**
 * 实物商品
 *
 * @author zhaoqw
 * @date 2022/05/27
 */
public class GoodsCommodityService implements ICommodity {
  private Logger logger = LoggerFactory.getLogger(GoodsCommodityService.class);

  // 模拟注入
  private GoodsService goodsService = new GoodsService();

  private String queryUserName(String uId) {
    return "花花";
  }
  private String queryUserPhoneNumber(String uId) {
    return "15200101232";
  }

  @Override
  public void sendCommodity(String uid, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
    DeliverReq deliverReq = new DeliverReq();
    deliverReq.setUserName(queryUserName(uid));
    deliverReq.setUserPhone(queryUserPhoneNumber(uid));
    deliverReq.setUserPhone(commodityId);
    deliverReq.setOrderId(bizId);
    deliverReq.setConsigneeUserName(extMap.get("consigneeUsername"));
    deliverReq.setConsigneeUserPhone(extMap.get("consigneeUserPhone"));
    deliverReq.setConsigneeUserAddress(extMap.get("userAddress"));
    boolean success = goodsService.deliverGoods(deliverReq);
    logger.info("请求参数[优惠卷] => uId:{} commodityId:{} bizId:{} extMap: {}", uid, commodityId, bizId, JSON.toJSON(extMap));
    logger.info("测试结果[优惠卷]: {}",success);

    if (!success) throw new RuntimeException("实物商品发放失败");
  }
}
