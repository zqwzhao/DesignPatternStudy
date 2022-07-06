package top.zhaoqw.study.creational.builder.action1;

import java.math.BigDecimal;

/**
 * @author zhaoqw
 * @date 2022/07/05
 */
public interface Matter {
  String sence(); // 场景 地板 地砖 涂料 吊顶

  String brand(); // 品牌

  String model(); // 型号

  BigDecimal price(); // 价格

  String desc(); // 描述
}
