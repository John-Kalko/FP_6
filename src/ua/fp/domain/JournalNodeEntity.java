package ua.fp.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * User: Ievgen_Kalko
 * Date: 6/14/13
 * Time: 5:40 PM
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "JOURNAL_NODE", schema = "FP", catalog = "")
@Entity
public class JournalNodeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Journal_gen")
    @SequenceGenerator(name = "Journal_gen", sequenceName = "S_JOURNAL_NODE", allocationSize = 1)
    @Column(name = "JOURNAL_NODE_ID")
    private int journalNodeId;

    @Column(name = "PER_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar perDate;

    @Column(name = "ACCOUNT_VALUE")
    private BigDecimal accountValue;

    @Column(name = "BALANCE")
    private BigDecimal balance;

    @Column(name = "OPERATION_TYPE")
    @Enumerated(EnumType.STRING)
    private OperationType operationType;

    @ManyToOne
    @JoinColumn(name = "ACCOUNT_REAL_ID", referencedColumnName = "ACCOUNT_REAL_ID", nullable = false)
    private AccountRealEntity accountRealByAccountRealId;

    public int getJournalNodeId() {
        return journalNodeId;
    }

    public Calendar getPerDate() {
        return perDate;
    }

    public void setPerDate(Calendar perDate) {
        this.perDate = perDate;
    }

    public BigDecimal getAccountValue() {
        return accountValue;
    }

    public void setAccountValue(BigDecimal accountValue) {
        this.accountValue = accountValue;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public AccountRealEntity getAccountRealByAccountRealId() {
        return accountRealByAccountRealId;
    }

    public void setAccountRealByAccountRealId(AccountRealEntity accountRealByAccountRealId) {
        this.accountRealByAccountRealId = accountRealByAccountRealId;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JournalNodeEntity)) return false;

        JournalNodeEntity that = (JournalNodeEntity) o;

        if (accountRealByAccountRealId != null ? !accountRealByAccountRealId.equals(that.accountRealByAccountRealId) : that.accountRealByAccountRealId != null)
            return false;
        if (balance != null ? !balance.equals(that.balance) : that.balance != null) return false;
        if (operationType != that.operationType) return false;
        if (perDate != null ? !perDate.equals(that.perDate) : that.perDate != null) return false;

        return true;
    }

    @Override
    public final int hashCode() {
        int result = perDate != null ? perDate.hashCode() : 0;
        result = 31 * result + (balance != null ? balance.hashCode() : 0);
        result = 31 * result + (operationType != null ? operationType.hashCode() : 0);
        result = 31 * result + (accountRealByAccountRealId != null ? accountRealByAccountRealId.hashCode() : 0);
        return result;
    }

    public static enum OperationType {
        EXPENSE_ADDING,
        INCOME_ADDING;
    }
}
