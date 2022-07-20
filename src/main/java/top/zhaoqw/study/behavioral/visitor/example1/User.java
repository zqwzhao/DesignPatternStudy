package top.zhaoqw.study.behavioral.visitor.example1;

/**
 * @author zhaoqw
 * @date 2022/07/12
 */
public abstract class User {
  public String name;      // 姓名
  public String identity;  // 身份；重点班、普通班 | 特级教师、普通教师、实习教师
  public String clazz;     // 班级

  public User(String name, String identity, String clazz) {
    this.name = name;
    this.identity = identity;
    this.clazz = clazz;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getIdentity() {
    return identity;
  }

  public void setIdentity(String identity) {
    this.identity = identity;
  }

  public String getClazz() {
    return clazz;
  }

  public void setClazz(String clazz) {
    this.clazz = clazz;
  }

  public abstract void accept(Visitor visitor);
}
