package top.zhaoqw.study.structural.adapter.example1;

/**
 *  如果 Adaptee 方法并不多，那两种实现方式都可以。
 *  如果 Adaptee 方法很多，而且 Adaptee 和 ITarget 方法定义大部分都相同，
 *  那我们推荐使用类适配器，因为 Adaptor 复用父类 Adaptee 的方法，比起对象适配器的实现方式，Adaptor 的代码量要少一些。
 *  如果 Adaptee 方法很多，而且 Adaptee 和 ITarget 方法定义大部分都不相同，那我们推荐使用对象适配器，因为组合结构相对于继承更加灵活。
 */
public class Adaptee {
  public void fa() {
    //...
  }

  public void fb() {
    //...
  }

  public void fc() {
    //...
  }
}
