package bridge.demo2;

import java.util.List;

public interface MsgSender {
  void send(String message);
}

class TelephoneMsgSender implements MsgSender {
  private List<String> telephones;

  public TelephoneMsgSender(List<String> telephones) {
    this.telephones = telephones;
  }

  @Override
  public void send(String message) {
    //...
  }

}

class EmailMsgSender implements MsgSender {
  @Override
  public void send(String message) {

  }
  // 与TelephoneMsgSender代码结构类似，所以省略...
}

class WechatMsgSender implements MsgSender {
  @Override
  public void send(String message) {

  }
  // 与TelephoneMsgSender代码结构类似，所以省略...
}

abstract class Notification {
  protected MsgSender msgSender;

  public Notification(MsgSender msgSender) {
    this.msgSender = msgSender;
  }

  public abstract void notify(String message);
}

// 系统告警
class SevereNotification extends Notification {
  public SevereNotification(MsgSender msgSender) {
    super(msgSender);
  }

  @Override
  public void notify(String message) {
    msgSender.send(message);
  }
}

// 比较紧急告警
class UrgencyNotification extends Notification {
  // 与SevereNotification代码结构类似，所以省略...
  public UrgencyNotification(MsgSender msgSender) {
    super(msgSender);
  }
  @Override
  public void notify(String message) {

  }

}

// 普通告警
class NormalNotification extends Notification {
  public NormalNotification(MsgSender msgSender) {
    super(msgSender);
  }
  @Override
  public void notify(String message) {

  }
  // 与SevereNotification代码结构类似，所以省略...
}

// 简单通知
class TrivialNotification extends Notification {
  public TrivialNotification(MsgSender msgSender) {
    super(msgSender);
  }

  @Override
  public void notify(String message) {

  }
  // 与SevereNotification代码结构类似，所以省略...
}
