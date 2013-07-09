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
@javax.persistence.Table(name = "EXPENSE_CALCULATOR_NODE", schema = "FP", catalog = "")
@Entity
public class ExpenseCalculatorNodeEntity {

    @Id
    @Column(name = "EXPENSE_CALCULATOR_NODE_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Ex_Calc_gen")
    @SequenceGenerator(name = "Ex_Calc_gen", sequenceName = "S_EXPENSE_CALCULATOR_NODE", allocationSize = 1)
    private int expenseCalculatorNodeId;

    @Column(name = "START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar startDate;

    @Column(name = "END_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar endDate;

    @Column(name = "REMAINDER")
    private BigDecimal remainder;

    @Column(name = "EXPENSE")
    private BigDecimal expense;

    @ManyToOne
    @JoinColumn(name = "EX_CAT_ID", referencedColumnName = "EX_CAT_ID", nullable = false)
    private PlanningExCategoryEntity planningExCategoryByExCatId;

    @ManyToOne
    @JoinColumn(name = "EX_SUBCAT_ID", referencedColumnName = "EX_SUBCAT_ID")
    private PlanningExSubcategoryEntity planningExSubcategoryByExSubcatId;

    public int getExpenseCalculatorNodeId() {
        return expenseCalculatorNodeId;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Calendar getEndDate() {
        return endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getRemainder() {
        return remainder;
    }

    public void setRemainder(BigDecimal remainder) {
        this.remainder = remainder;
    }

    public BigDecimal getExpense() {
        return expense;
    }

    public void setExpense(BigDecimal expense) {
        this.expense = expense;
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
        if (!(o instanceof ExpenseCalculatorNodeEntity)) return false;

        ExpenseCalculatorNodeEntity that = (ExpenseCalculatorNodeEntity) o;

        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (expense != null ? !expense.equals(that.expense) : that.expense != null) return false;
        if (planningExCategoryByExCatId != null ? !planningExCategoryByExCatId.equals(that.planningExCategoryByExCatId) :
                that.planningExCategoryByExCatId != null)
            return false;
        if (remainder != null ? !remainder.equals(that.remainder) : that.remainder != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;

        return true;
    }

    @Override
    public final int hashCode() {
        int result = startDate != null ? startDate.hashCode() : 0;
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (remainder != null ? remainder.hashCode() : 0);
        result = 31 * result + (expense != null ? expense.hashCode() : 0);
        result = 31 * result + (planningExCategoryByExCatId != null ? planningExCategoryByExCatId.hashCode() : 0);
        return result;
    }
}
