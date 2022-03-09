package adapter.action.example3.extention;


import adapter.action.example3.Demo;
import adapter.action.example3.IA;

// 将外部系统A替换成外部系统B
public class BAdaptor implements IA {
  private B b;
  public BAdaptor(B b) {
    this.b= b;
  }
  public void fa() {
    //...
    b.fb();
  }

  public static void main(String[] args) {
    // 借助BAdaptor，Demo的代码中，调用IA接口的地方都无需改动，
// 只需要将BAdaptor如下注入到Demo即可。
    Demo d = new Demo(new BAdaptor(new B()));
  }
}
