package top.zhaoqw.study.creational.simplefactory.action2.v2.store.goods;

import com.alibaba.fastjson.JSON;

/**
 * @author zhaoqw
 * @date 2022/06/01
 */
public class GoodsService {

  public boolean deliverGoods(DeliverReq req) {
    System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
    return true;
  }
}
