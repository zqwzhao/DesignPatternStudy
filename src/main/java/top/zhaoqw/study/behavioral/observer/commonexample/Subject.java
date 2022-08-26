package top.zhaoqw.study.behavioral.observer.commonexample;

/**
 * 定义注册接口，移除观察器接口，提醒观察者接口
 *
 * @author zhaoqw
 * @date 2022/08/26
 */
public interface Subject {
  void registerObserver(Observer observer);

  void removeObserver(Observer observer);

  void notifyObservers(String message);
}
