package behavioral.strategy.example1;

/**
 *  1. 策略的定义
 */
public interface Strategy {
  void algorithmInterface();
}

/*public*/ class ConcreteStrategyA implements Strategy {
  @Override
  public void  algorithmInterface() {
    //具体的算法...
  }
}

/*public*/ class ConcreteStrategyB implements Strategy {
  @Override
  public void  algorithmInterface() {
    //具体的算法...
  }
}
