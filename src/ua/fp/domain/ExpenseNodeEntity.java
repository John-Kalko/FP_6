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
@javax.persistence.Table(name = "EXPENSE_NODE", schema = "FP", catalog = "")
@Entity
public class ExpenseNodeEntity {

    @Id
    @Column(name = "ENPENSE_NODE_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Ex_Node_gen")
    @SequenceGenerator(name = "Ex_Node_gen", sequenceName = "S_EXPENSE_NODE", allocationSize = 1)
    private int enpenseNodeId;

    @Column(name = "EXPENSE_VALUE")
    private BigDecimal expenseValue;

    @Column(name = "PER_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar perDate;

    @Column(name = "SH_DESCRIPTION")
    @Basic(optional = true)
    private String shDescription;

    @ManyToOne
    @JoinColumn(name = "ACCOUNT_ID", referencedColumnName = "ACCOUNT_ID", nullable = false)
    private AccountEntity accountByAccountId;

    @ManyToOne
    @JoinColumn(name = "EX_CAT_ID", referencedColumnName = "EX_CAT_ID", nullable = false)
    private PlanningExCategoryEntity planningExCategoryByExCatId;

    @ManyToOne
    @JoinColumn(name = "EX_SUBCAT_ID", referencedColumnName = "EX_SUBCAT_ID", nullable = true)
    private PlanningExSubcategoryEntity planningExSubcategoryByExSubcatId;

    public int getEnpenseNodeId() {
        return enpenseNodeId;
    }

    public BigDecimal getExpenseValue() {
        return expenseValue;
    }

    public void setExpenseValue(BigDecimal expenseValue) {
        this.expenseValue = expenseValue;
    }

    public Calendar getPerDate() {
        return perDate;
    }

    public void setPerDate(Calendar perDate) {
        this.perDate = perDate;
    }

    public String getShDescription() {
        return shDescription;
    }

    public void setShDescription(String shDescription) {
        this.shDescription = shDescription;
    }

    public AccountEntity getAccountByAccountId() {
        return accountByAccountId;
    }

    public void setAccountByAccountId(AccountEntity accountByAccountId) {
        this.accountByAccountId = accountByAccountId;
    }

    public PlanningExCategoryEntity getPlanningExCategoryByExCatId() {
        return planningExCategoryByExCatId;
    }

    public void setPlanningExCategoryByExCatId(PlanningExCategoryEntity planningExCategoryByExCatId) {
        this.planningExCategoryByExCatId = planningExCategoryByExCatId;
    }

    public PlanningExSubcategoryEntity getPlanningExSubcategoryByExSubcatId() {
        return planningExSubcategoryByExSubcatId;
    }

    public void setPlanningExSubcategoryByExSubcatId(PlanningExSubcategoryEntity planningExSubcategoryByExSubcatId) {
        this.planningExSubcategoryByExSubcatId = planningExSubcategoryByExSubcatId;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExpenseNodeEntity)) return false;

        ExpenseNodeEntity that = (ExpenseNodeEntity) o;

        if (accountByAccountId != null ? !accountByAccountId.equals(that.accountByAccountId) : that.accountByAccountId != null)
            return false;
        if (expenseValue != null ? !expenseValue.equals(that.expenseValue) : that.expenseValue != null) return false;
        if (perDate != null ? !perDate.equals(that.perDate) : that.perDate != null) return false;
        if (planningExCategoryByExCatId != null ? !planningExCategoryByExCatId.equals(that.planningExCategoryByExCatId) :
                that.planningExCategoryByExCatId != null)
            return false;

        return true;
    }

    @Override
    public final int hashCode() {
        int result = expenseValue != null ? expenseValue.hashCode() : 0;
        result = 31 * result + (perDate != null ? perDate.hashCode() : 0);
        result = 31 * result + (accountByAccountId != null ? accountByAccountId.hashCode() : 0);
        result = 31 * result + (planningExCategoryByExCatId != null ? planningExCategoryByExCatId.hashCode() : 0);
        return result;
    }
}
