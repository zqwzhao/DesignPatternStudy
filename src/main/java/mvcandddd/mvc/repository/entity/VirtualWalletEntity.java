package mvcandddd.mvc.repository.entity;

import mvcandddd.mvc.common.TransactionType;

import java.math.BigDecimal;

/**
 * @author: zhaoqw
 * @date: 2022/1/18 10:19
 */
public class VirtualWalletEntity {
    private Long id;
    private Long createTime;
    private BigDecimal balance;
    private TransactionType type;

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

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }
}
