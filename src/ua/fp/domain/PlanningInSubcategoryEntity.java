package ua.fp.domain;

import ua.fp.domain.superclasses.Subcategory;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: Ievgen_Kalko
 * Date: 6/14/13
 * Time: 5:40 PM
 * To change this template use File | Settings | File Templates.
 */
@Inheritance(strategy = InheritanceType.JOINED)
@javax.persistence.Table(name = "PLANNING_IN_SUBCATEGORY", schema = "FP", catalog = "")
@Entity
public class PlanningInSubcategoryEntity extends Subcategory {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Plan_ex_sub_gen")
    @SequenceGenerator(name = "Plan_ex_sub_gen", sequenceName = "S_PLANNING_EX_SUBCATEGORY", allocationSize = 1)
    @Column(name = "IN_SUBCAT_ID")
    private int inSubcatId;

    @ManyToOne
    @javax.persistence.JoinColumn(name = "IN_CAT_ID", referencedColumnName = "IN_CAT_ID", nullable = false)
    private PlanningInCategoryEntity planningInCategoryByInCatId;

    public int getInSubcatId() {
        return inSubcatId;
    }

    public void setPlanningInCategoryByInCatId(PlanningInCategoryEntity planningInCategoryByInCatId) {
        this.planningInCategoryByInCatId = planningInCategoryByInCatId;
    }

    public PlanningInCategoryEntity getPlanningInCategoryByInCatId() {
        return planningInCategoryByInCatId;
    }

    @Override
    public boolean canEqual(Object other) {
        return (other instanceof PlanningInSubcategoryEntity);
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlanningInSubcategoryEntity)) return false;
        if (!super.equals(o)) return false;

        PlanningInSubcategoryEntity that = (PlanningInSubcategoryEntity) o;

        if(!that.canEqual(this)) return false;
        if (planningInCategoryByInCatId != null ? !planningInCategoryByInCatId.equals(that.planningInCategoryByInCatId) : that.planningInCategoryByInCatId != null)
            return false;

        return true;
    }

    @Override
    public final int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (planningInCategoryByInCatId != null ? planningInCategoryByInCatId.hashCode() : 0);
        return result;
    }
}
