package structural.bridge.demo1;

/**
 * @author: zhaoqw
 * @date: 2022/3/2 09:54
 */
public class AlertHandler {
  private AlertRule alertRule;
  private Notification notification;
  public AlertHandler(AlertRule alertRule, Notification notification) {
    this.alertRule = alertRule;
    this.notification = notification;
  }

  public void check(ApiStatInfo apiStatInfo) {}
}
