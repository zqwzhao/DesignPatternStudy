package top.zhaoqw.study.creational.builder.action1.ceilling;

import top.zhaoqw.study.creational.builder.action1.Matter;

import java.math.BigDecimal;

/**
 * @author zhaoqw
 * @date 2022/07/05
 */
public class LevelTwoCeiling implements Matter {
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
    return "二级顶";
  }

  @Override
  public BigDecimal price() {
    return new BigDecimal(850);
  }

  @Override
  public String desc() {
    return "两个层次的吊顶，⼆级吊顶⾼度⼀般就往下吊20cm，要是层⾼很⾼，也可增加\n" +
        "每级的厚度";
  }
}
