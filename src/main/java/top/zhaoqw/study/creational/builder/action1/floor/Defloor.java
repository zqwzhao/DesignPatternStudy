package top.zhaoqw.study.creational.builder.action1.floor;

import top.zhaoqw.study.creational.builder.action1.Matter;

import java.math.BigDecimal;

/**
 * @author zhaoqw
 * @date 2022/07/05
 */
public class Defloor implements Matter {
  @Override
  public String sence() {
    return "地板";
  }

  @Override
  public String brand() {
    return "德尔(DR)";
  }

  @Override
  public String model() {
    return "A+";
  }

  @Override
  public BigDecimal price() {
    return new BigDecimal(119);
  }

  @Override
  public String desc() {
    return "DER德尔集团是全球领先的专业⽊地板制造商，北京2008年奥运会家装和公装地板供应商";
  }
}
