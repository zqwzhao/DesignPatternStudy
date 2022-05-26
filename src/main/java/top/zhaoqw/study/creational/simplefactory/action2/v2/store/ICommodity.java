package top.zhaoqw.study.creational.simplefactory.action2.v2.store;

import java.util.Map;

/**
 * 发奖接口
 *
 * @author zhaoqw
 * @date 2022/05/26
 */
public interface ICommodity {
  /**
   * 扩展字段 ⽤于处理发放实物商品时的收获地
   * 址。
   *
   * @param uid 用户id
   * @param commodityId 奖品id
   * @param bizId 业务id
   * @param extMap 扩展字段
   */
  void sendCommodity(String uid, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
