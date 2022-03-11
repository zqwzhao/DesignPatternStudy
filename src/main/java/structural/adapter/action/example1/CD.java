package structural.adapter.action.example1;

/**
 * 假设我们依赖的外部系统在接口设计方面有缺陷（比如包含大量静态方法），
 * 引入之后会影响到我们自身代码的可测试性。为了隔离设计上的缺陷，
 * 我们希望对外部系统提供的接口进行二次封装，抽象出更好的接口设计，这个时候就可以使用适配器模式了。
 */
public class CD { //这个类来自外部sdk，我们无权修改它的代码
  //...
  public static void staticFunction1() {
    //...
  }

  protected void uglyNamingFucntion2() {
  }

  // 后面可能还有很多参数
  public void tooManyParamsFunction3(int paramA, int paramB) {
    //...

  }

  public void lowPerformanceFunction4() {

  }


}

// 使用适配器模式进行重构
/*public */interface ITarget {
  void function1();

  void function2();

  void fucntion3(ParamsWrapperDefinition paramsWrapper);

  void function4();
  //...
}

// 注意：适配器类的命名不一定非得末尾带Adaptor
/*public*/ class CDAdaptor extends CD implements ITarget {
  //...
  public void function1() {
    super.staticFunction1();
  }

  public void function2() {
    super.uglyNamingFucntion2();
  }

  @Override
  public void fucntion3(ParamsWrapperDefinition paramsWrapper) {
    super.tooManyParamsFunction3(paramsWrapper.getParamA(), paramsWrapper.getParamB());
  }


  public void function4() {
    //...reimplement it...
  }
}
