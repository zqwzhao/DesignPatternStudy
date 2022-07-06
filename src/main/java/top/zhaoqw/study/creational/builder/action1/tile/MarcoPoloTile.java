package top.zhaoqw.study.creational.builder.action1.tile;

import top.zhaoqw.study.creational.builder.action1.Matter;

import java.math.BigDecimal;

/**
 * @author zhaoqw
 * @date 2022/07/05
 */
public class MarcoPoloTile implements Matter {
  @Override
  public String sence() {
    return "地砖";
  }

  public String brand() {
    return "⻢可波罗(MARCO POLO)";
  }
  public String model() {
    return "缺省";
  }
  public BigDecimal price() {
    return new BigDecimal(140);
  }
  public String desc() {
    return "“⻢可波罗”品牌诞⽣于1996年，作为国内最早品牌化的建陶品牌，以“⽂化陶瓷”占领市场，享有“仿古砖⾄尊”的美誉。";
  }
}
