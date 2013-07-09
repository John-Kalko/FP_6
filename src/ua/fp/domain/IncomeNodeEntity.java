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
@javax.persistence.Table(name = "INCOME_NODE", schema = "FP", catalog = "")
@Entity
public class IncomeNodeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "In_Node_gen")
    @SequenceGenerator(name = "In_Node_gen", sequenceName = "S_INCOME_NODE", allocationSize = 1)
    @Column(name = "INCOME_NODE_ID")
    private int incomeNodeId;

    @Column(name = "IS_CONFIRMED")
    @Basic(optional = true)
    private char isConfirmed;

    @Column(name = "IS_DECLINED")
    @Basic(optional = true)
    private char isDeclined;

    @ManyToOne
    @JoinColumn(name = "IN_CAT_ID", referencedColumnName = "IN_CAT_ID", nullable = false)
    private PlanningInCategoryEntity planningInCategoryByInCatId;

    @ManyToOne
    @JoinColumn(name = "IN_SUBCAT_ID", referencedColumnName = "IN_SUBCAT_ID", nullable = true)
    private PlanningInSubcategoryEntity planningInSubcategoryByInSubcatId;

    public int getIncomeNodeId() {
        return incomeNodeId;
    }

    public char getConfirmed() {
        return isConfirmed;
    }

    public void setConfirmed(char confirmed) {
        isConfirmed = confirmed;
    }

    public char getDeclined() {
        return isDeclined;
    }

    public void setDeclined(char declined) {
        isDeclined = declined;
    }

    public PlanningInCategoryEntity getPlanningInCategoryByInCatId() {
        return planningInCategoryByInCatId;
    }

    public void setPlanningInCategoryByInCatId(PlanningInCategoryEntity planningInCategoryByInCatId) {
        this.planningInCategoryByInCatId = planningInCategoryByInCatId;
    }

    public PlanningInSubcategoryEntity getPlanningInSubcategoryByInSubcatId() {
        return planningInSubcategoryByInSubcatId;
    }

    public void setPlanningInSubcategoryByInSubcatId(PlanningInSubcategoryEntity planningInSubcategoryByInSubcatId) {
        this.planningInSubcategoryByInSubcatId = planningInSubcategoryByInSubcatId;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IncomeNodeEntity)) return false;

        IncomeNodeEntity that = (IncomeNodeEntity) o;

        if (isConfirmed != that.isConfirmed) return false;
        if (isDeclined != that.isDeclined) return false;
        if (planningInCategoryByInCatId != null ? !planningInCategoryByInCatId.equals(that.planningInCategoryByInCatId) : that.planningInCategoryByInCatId != null)
            return false;

        return true;
    }

    @Override
    public final int hashCode() {
        int result = (int) isConfirmed;
        result = 31 * result + (int) isDeclined;
        result = 31 * result + (planningInCategoryByInCatId != null ? planningInCategoryByInCatId.hashCode() : 0);
        return result;
    }
}
