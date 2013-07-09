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
@javax.persistence.Table(name = "PLANNING_EX_SUBCATEGORY", schema = "FP", catalog = "")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class PlanningExSubcategoryEntity extends Subcategory {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Plan_ex_sub_gen")
    @SequenceGenerator(name = "Plan_ex_sub_gen", sequenceName = "S_PLANNING_EX_SUBCATEGORY", allocationSize = 1)
    @Column(name = "EX_SUBCAT_ID")
    private int exSubcatId;


    @ManyToOne
    @JoinColumn(name = "EX_CAT_ID", referencedColumnName = "EX_CAT_ID", nullable = false)
    private PlanningExCategoryEntity planningExCategoryByExCatId;

    public int getExSubcatId() {
        return exSubcatId;
    }

    public PlanningExCategoryEntity getPlanningExCategoryByExCatId() {
        return planningExCategoryByExCatId;
    }

    public void setPlanningExCategoryByExCatId(PlanningExCategoryEntity planningExCategoryByExCatId) {
        this.planningExCategoryByExCatId = planningExCategoryByExCatId;
    }

    @Override
    public boolean canEqual(Object other) {
        return (other instanceof PlanningExSubcategoryEntity);
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlanningExSubcategoryEntity)) return false;
        if (!super.equals(o)) return false;

        PlanningExSubcategoryEntity that = (PlanningExSubcategoryEntity) o;

        if(!that.canEqual(this)) return false;
        if (planningExCategoryByExCatId != null ? !planningExCategoryByExCatId.equals(that.planningExCategoryByExCatId) : that.planningExCategoryByExCatId != null)
            return false;

        return true;
    }

    @Override
    public final int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (planningExCategoryByExCatId != null ? planningExCategoryByExCatId.hashCode() : 0);
        return result;
    }
}
