package top.zhaoqw.study.principle.single.reponsibility.example1;

/**
 * 第一种观点是 UserInfo 类包含的都是跟用户相关的信息，所有的属性和方法都隶属于用户这样一个业务模型，满足单一职责原则；
 * 另一种观点是，地址信息在 UserInfo 类中，所占的比重比较高，可以继续拆分成独立的 UserAddress 类
 *
 * 只是单纯地用来展示，那 UserInfo 现在的设计就是合理的
 * 但如果业务需要，比如电商系统，包括用户信息和收货地址，那么就需要进行拆分
 *
 * 可以先写一个粗粒度的类，满足业务需求。
 * 随着业务的发展，如果粗粒度的类越来越庞大，代码越来越多，这个时候，
 * 我们就可以将这个粗粒度的类，拆分成几个更细粒度的类。这就是所谓的持续重构
 * @author: zhaoqw
 * @date: 2022/3/23 08:45
 */
public class UserInfo {
  private long userId;
  private String username;
  private String email;
  private String telephone;
  private long createTime;
  private long lastLoginTime;
  private String avatarUrl;
  // 省
  private String provinceOfAddress;
  // 市
  private String cityOfAddress;
  // 区
  private String regionOfAddress;
  // 详细地址
  private String detailedAddress;

  // ...省略其他属性和方法...
}
