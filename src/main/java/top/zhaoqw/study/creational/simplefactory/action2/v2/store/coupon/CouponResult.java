package top.zhaoqw.study.creational.simplefactory.action2.v2.store.coupon;

/**
 * 发奖结果
 *
 * @author zhaoqw
 * @date 2022/05/27
 */
public class CouponResult {
  private String code;
  private String message;


  public CouponResult() {
  }

  public CouponResult(String code, String message) {
    this.code = code;
    this.message = message;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
