package top.zhaoqw.study.creational.builder.action1.coat;

import top.zhaoqw.study.creational.builder.action1.Matter;

import java.math.BigDecimal;

/**
 * 立邦涂料
 *
 * @author zhaoqw
 * @date 2022/07/05
 */
public class LiBangCoat implements Matter {
  @Override
  public String sence() {
    return "涂料";
  }

  @Override
  public String brand() {
    return "立邦";
  }

  @Override
  public String model() {
    return "默认级别";
  }

  @Override
  public BigDecimal price() {
    return new BigDecimal(650);
  }

  @Override
  public String desc() {
    return "⽴邦始终以开发绿⾊产品、注᯿⾼科技、⾼品质为⽬标，以技术⼒量不断推进科 研和开发，满⾜消费者需求。";
  }
}
