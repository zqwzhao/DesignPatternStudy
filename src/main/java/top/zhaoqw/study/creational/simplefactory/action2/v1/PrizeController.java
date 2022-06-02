package top.zhaoqw.study.creational.simplefactory.action2.v1;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.zhaoqw.study.creational.simplefactory.action2.v2.store.card.IQiYiCardService;
import top.zhaoqw.study.creational.simplefactory.action2.v2.store.coupon.CouponResult;
import top.zhaoqw.study.creational.simplefactory.action2.v2.store.coupon.CouponService;
import top.zhaoqw.study.creational.simplefactory.action2.v2.store.goods.DeliverReq;
import top.zhaoqw.study.creational.simplefactory.action2.v2.store.goods.GoodsService;

/**
 * 案例：模拟一个营销场景的发奖策略
 * 有三类奖品：
 *  优惠券
 *  实物商品
 *  第三⽅爱奇艺兑换卡
 *  随着后续的业务的发展，会新增其他种商品类型
 *
 *  第一种做法就是很容易能够想到的if/else
 * @author zhaoqw
 * @date 2022/05/26
 */
public class PrizeController {
  private Logger logger = LoggerFactory.getLogger(PrizeController.class);

  public static void main(String[] args) {


  }

  private String queryUserName(String uId) {
    return "花花";
  }

  private String queryUserPhoneNumber(String uId) {
    return "15200101232";
  }


  /**
   * 如果这么写，一大摞代码放在一个方法里面，
   * 不满足单一职责原则
   * @param req 发奖请求
   * @return 奖品信息
   */
  public AwardRes awardToUser(AwardReq req) {
    String reqJson = JSON.toJSONString(req);
    AwardRes awardRes = null;
    try {
      logger.info("奖品发放开始{}。req:{}", req.getuId(), reqJson);
      // 按照不同类型方法商品[1优惠券、2实物商品、3第三方兑换卡(爱奇艺)]
      if (req.getAwardType() == 1) {
        CouponService couponService = new CouponService();
        CouponResult couponResult = couponService.sendCoupon(req.getuId(), req.getAwardNumber(), req.getBizId());
        if ("0000".equals(couponResult.getCode())) {
          awardRes = new AwardRes("0000", "发放成功");
        } else {
          awardRes = new AwardRes("0001", couponResult.getInfo());
        }
      } else if (req.getAwardType() == 2) {
        GoodsService goodsService = new GoodsService();
        DeliverReq deliverReq = new DeliverReq();
        deliverReq.setUserName(queryUserName(req.getuId()));
        deliverReq.setUserPhone(queryUserPhoneNumber(req.getuId()));
        deliverReq.setSku(req.getAwardNumber());
        deliverReq.setOrderId(req.getBizId());
        deliverReq.setConsigneeUserName(req.getExtMap().get("consigneeUserName"));
        deliverReq.setConsigneeUserPhone(req.getExtMap().get("consigneeUserPhone"));
        deliverReq.setConsigneeUserAddress(req.getExtMap().get("consigneeUserAddress"));
        Boolean isSuccess = goodsService.deliverGoods(deliverReq);
        if (isSuccess) {
          awardRes = new AwardRes("0000", "发放成功");
        } else {
          awardRes = new AwardRes("0001", "发放失败");
        }
      } else if (req.getAwardType() == 3) {
        String bindMobileNumber = queryUserPhoneNumber(req.getuId());
        IQiYiCardService iQiYiCardService = new IQiYiCardService();
        iQiYiCardService.grantToken(bindMobileNumber, req.getAwardNumber());
        awardRes = new AwardRes("0000", "发放成功");
      }
      logger.info("奖品发放完成{}。", req.getuId());
    } catch (Exception e) {
      logger.error("奖品发放失败{}。req:{}", req.getuId(), reqJson, e);
      awardRes = new AwardRes("0001", e.getMessage());
    }
    return awardRes;
  }
}
