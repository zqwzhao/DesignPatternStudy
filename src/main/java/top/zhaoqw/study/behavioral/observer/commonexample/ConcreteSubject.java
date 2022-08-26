package top.zhaoqw.study.behavioral.observer.commonexample;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaoqw
 * @date 2022/08/26
 */
public class ConcreteSubject implements Subject{
  private List<Observer> observers = new ArrayList<>();



  @Override
  public void registerObserver(Observer observer) {

  }

  @Override
  public void removeObserver(Observer observer) {

  }

  @Override
  public void notifyObservers(String message) {
  }
}
