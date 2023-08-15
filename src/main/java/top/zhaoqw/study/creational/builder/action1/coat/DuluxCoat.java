package top.zhaoqw.study.creational.builder.action1.coat;

import top.zhaoqw.study.creational.builder.action1.Matter;

import java.math.BigDecimal;

/**
 * 涂料
 *
 * @author zhaoqw
 * @date 2022/07/05
 */
public class DuluxCoat implements Matter {
  @Override
  public String sence() {
    return "涂料";
  }

  @Override
  public String brand() {
    return "多乐士(Dulux)";
  }

  @Override
  public String model() {
    return "第二代";
  }

  @Override
  public BigDecimal price() {
    return new BigDecimal(719);
  }

  @Override
  public String desc() {
    return "多乐⼠是阿克苏诺⻉尔旗下的著名建筑装饰油漆品牌，产品畅销于全球100个国 家，每年全球有5000万户家庭使⽤多乐⼠油漆。";
  }
}
