package top.zhaoqw.study.creational.builder.action1.ceilling;

import top.zhaoqw.study.creational.builder.action1.Matter;

import java.math.BigDecimal;

/**
 * @author zhaoqw
 * @date 2022/07/05
 */
public class LevelOneCeiling implements Matter {
  @Override
  public String sence() {
    return "吊顶";
  }

  @Override
  public String brand() {
    return "装修公司自带";
  }

  @Override
  public String model() {
    return "一级顶";
  }

  @Override
  public BigDecimal price() {
    return new BigDecimal(260);
  }

  @Override
  public String desc() {
    return "造型只做低⼀级，只有⼀个层次的吊顶，⼀般离顶120-150mm";
  }
}
