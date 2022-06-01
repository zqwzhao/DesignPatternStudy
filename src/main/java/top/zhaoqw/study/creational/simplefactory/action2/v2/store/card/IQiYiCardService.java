package top.zhaoqw.study.creational.simplefactory.action2.v2.store.card;

/**
 * @author zhaoqw
 * @date 2022/06/01
 */
public class IQiYiCardService {

  /**
   * 模拟发奖
   * @param bindMobileNumber 手机号码
   * @param cardId 卡的编号
   */
  public void grantToken(String bindMobileNumber, String cardId) {
    System.out.println("模拟发放爱奇艺会员卡一张：" + bindMobileNumber + "，" + cardId);
  }
}
