package top.zhaoqw.study.creational.builder.action1.floor;

import top.zhaoqw.study.creational.builder.action1.Matter;

import java.math.BigDecimal;

/**
 * @author zhaoqw
 * @date 2022/07/05
 */
public class ShengXiangFloor implements Matter {
  @Override
  public String sence() {
    return "地板";
  }

  @Override
  public String brand() {
    return "圣象";
  }

  @Override
  public String model() {
    return "一级";
  }

  @Override
  public BigDecimal price() {
    return new BigDecimal(318);
  }

  @Override
  public String desc() {
    return "圣象地板是中国地板⾏业著名品牌。圣象地板拥有中国驰名商标、中国名牌、国家免检、中国环境标志认证等多项荣誉。";
  }
}
