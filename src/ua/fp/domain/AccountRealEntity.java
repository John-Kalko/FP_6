package ua.fp.domain;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: Ievgen_Kalko
 * Date: 6/14/13
 * Time: 5:40 PM
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "ACCOUNT_REAL", schema = "FP", catalog = "")
@Entity
public class AccountRealEntity {

    @Id
    @Column(name = "ACCOUNT_REAL_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Acc_real_gen")
    @SequenceGenerator(name = "Acc_real_gen", sequenceName = "S_ACCOUNT_REAL", allocationSize = 1)
    private int accountRealId;

    @Column(name = "INIT_VALUE")
    private BigDecimal initValue;

    @Column(name = "EXPENSE_VALUE")
    private BigDecimal expenseValue;

    @ManyToOne
    @JoinColumn(name = "ACCOUNT_ID", referencedColumnName = "ACCOUNT_ID", nullable = false)
    private AccountEntity accountByAccountId;

    public int getAccountRealId() {
        return accountRealId;
    }

    public BigDecimal getInitValue() {
        return initValue;
    }

    public void setInitValue(BigDecimal initValue) {
        this.initValue = initValue;
    }

    public BigDecimal getExpenseValue() {
        return expenseValue;
    }

    public void setExpenseValue(BigDecimal expenseValue) {
        this.expenseValue = expenseValue;
    }

    public AccountEntity getAccountByAccountId() {
        return accountByAccountId;
    }

    public void setAccountByAccountId(AccountEntity accountByAccountId) {
        this.accountByAccountId = accountByAccountId;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountRealEntity)) return false;

        AccountRealEntity that = (AccountRealEntity) o;

        if (accountByAccountId != null ? !accountByAccountId.equals(that.accountByAccountId) : that.accountByAccountId != null)
            return false;
        if (expenseValue != null ? !expenseValue.equals(that.expenseValue) : that.expenseValue != null) return false;
        if (initValue != null ? !initValue.equals(that.initValue) : that.initValue != null) return false;

        return true;
    }

    @Override
    public final int hashCode() {
        int result = initValue != null ? initValue.hashCode() : 0;
        result = 31 * result + (expenseValue != null ? expenseValue.hashCode() : 0);
        result = 31 * result + (accountByAccountId != null ? accountByAccountId.hashCode() : 0);
        return result;
    }
}
