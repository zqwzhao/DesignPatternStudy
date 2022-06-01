package top.zhaoqw.study.creational.simplefactory.action2.v2.store.impl;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.zhaoqw.study.creational.simplefactory.action2.v2.store.ICommodity;
import top.zhaoqw.study.creational.simplefactory.action2.v2.store.card.IQiYiCardService;

import java.util.Map;

/**
 * @author zhaoqw
 * @date 2022/06/01
 */
public class CardCommodityService implements ICommodity {
  private Logger logger = LoggerFactory.getLogger(CardCommodityService.class);

  // 模拟注⼊
  private IQiYiCardService iQiYiCardService = new IQiYiCardService();

  @Override
  public void sendCommodity(String uid, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
    String mobile = queryUserMobile(uid);
    iQiYiCardService.grantToken(mobile, bizId);
    logger.info("请求参数[爱奇艺兑换卡] => uId：{} commodityId：{} bizId： {} extMap：{}", uid, commodityId, bizId, JSON.toJSON(extMap));
    logger.info("测试结果[爱奇艺兑换卡]：success");
  }

  private String queryUserMobile(String uid) {
    return "15588885555";
  }
}
