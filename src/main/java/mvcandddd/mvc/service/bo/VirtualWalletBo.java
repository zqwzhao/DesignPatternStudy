package mvcandddd.mvc.service.bo;

import java.math.BigDecimal;

/**
 * @author: zhaoqw
 * @date: 2022/1/18 10:04
 */
public class VirtualWalletBo {
    //省略getter/setter/constructor方法
    private Long id;
    private Long createTime;
    private BigDecimal balance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "VirtualWalletBo{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", balance=" + balance +
                '}';
    }
}