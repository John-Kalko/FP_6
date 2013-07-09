package ua.fp.domain.superclasses;

import ua.fp.domain.AccountEntity;
import ua.fp.domain.util.PlanningPeriod;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * User: Ievgen_Kalko
 * Date: 6/17/13
 * Time: 4:28 PM
 * To change this template use File | Settings | File Templates.
 */
@MappedSuperclass
public abstract class Category {

    @Column(name = "CATEGORY_TITLE")
    @Basic(optional = false)
    private String title;

    @Column(name = "AMOUNT")
    @Basic(optional = false)
    private BigDecimal amount;

    @Column(name = "PER_DATE")
    @Basic(optional = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar perDate;

    @Column(name = "IS_NO_SUBCAT")
    @Basic(optional = true)
    private char isNoSubcat;

    @Column(name = "SH_DESCRIPTION")
    @Basic(optional = true)
    private String shDescription;

    @Column(name = "PERIOD")
    @Enumerated(EnumType.STRING)
    @Basic(optional = false)
    private PlanningPeriod period;

    @ManyToOne
    @JoinColumn(name = "ACCOUNT_ID", referencedColumnName = "ACCOUNT_ID", nullable = false)
    private AccountEntity accountByAccountId;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {

        return title;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Calendar getPerDate() {
        return perDate;
    }

    public void setPerDate(Calendar perDate) {
        this.perDate = perDate;
    }

    public char getNoSubcat() {
        return isNoSubcat;
    }

    public void setNoSubcat(char noSubcat) {
        isNoSubcat = noSubcat;
    }

    public String getShDescription() {
        return shDescription;
    }

    public void setShDescription(String shDescription) {
        this.shDescription = shDescription;
    }

    public PlanningPeriod getPeriod() {
        return period;
    }

    public void setPeriod(PlanningPeriod period) {
        this.period = period;
    }

    public AccountEntity getAccountByAccountId() {
        return accountByAccountId;
    }

    public void setAccountByAccountId(AccountEntity accountByAccountId) {
        this.accountByAccountId = accountByAccountId;
    }

    public boolean canEqual(Object other) {
        return (other instanceof Category);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category)) return false;

        Category category = (Category) o;

        if(!category.canEqual(this)) return false;
        if (accountByAccountId != null ? !accountByAccountId.equals(category.accountByAccountId) : category.accountByAccountId != null)
            return false;
        if (amount != null ? !amount.equals(category.amount) : category.amount != null) return false;
        if (perDate != null ? !perDate.equals(category.perDate) : category.perDate != null) return false;
        if (title != null ? !title.equals(category.title) : category.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (perDate != null ? perDate.hashCode() : 0);
        result = 31 * result + (accountByAccountId != null ? accountByAccountId.hashCode() : 0);
        return result;
    }
}
