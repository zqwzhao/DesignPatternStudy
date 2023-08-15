package top.zhaoqw.study.behavioral.visitor.example1;

/**
 * @author zhaoqw
 * @date 2022/07/15
 */
public class Student extends User {
  public Student(String name, String identity, String clazz) {
    super(name, identity, clazz);
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public int ranking() {
    return (int) (Math.random() * 100);
  }
}
