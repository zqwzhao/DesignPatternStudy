package top.zhaoqw.study.behavioral.visitor.example1;

import java.math.BigDecimal;

/**
 * @author zhaoqw
 * @date 2022/07/15
 */
public class Teacher extends User {

  public Teacher(String name, String identity, String clazz) {
    super(name, identity, clazz);
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  // 升本率
  public double entranceRatio() {
    return BigDecimal.valueOf(Math.random() * 100).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
  }
}
