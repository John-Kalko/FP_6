package ua.fp.domain;

import ua.fp.domain.superclasses.Category;

import javax.persistence.*;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Ievgen_Kalko
 * Date: 6/14/13
 * Time: 5:40 PM
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "PLANNING_EX_CATEGORY", schema = "FP", catalog = "")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class PlanningExCategoryEntity extends Category {

    @Id
    @Column(name = "EX_CAT_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Plan_ex_gen")
    @SequenceGenerator(name = "Plan_ex_gen", sequenceName = "S_PLANNING_EX_CATEGORY", allocationSize = 1)
    private int exCatId;

    @OneToMany(mappedBy = "planningExCategoryByExCatId")
    private List<PlanningExSubcategoryEntity> planningExSubcategoriesByExCatId;

    public int getExCatId() {
        return exCatId;
    }

    public List<PlanningExSubcategoryEntity> getPlanningExSubcategoriesByExCatId() {
        return planningExSubcategoriesByExCatId;
    }

    public void setPlanningExSubcategoriesByExCatId(List<PlanningExSubcategoryEntity> planningExSubcategoriesByExCatId) {
        this.planningExSubcategoriesByExCatId = planningExSubcategoriesByExCatId;
    }

    @Override
    public boolean canEqual(Object other) {
        return (other instanceof PlanningExCategoryEntity);
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlanningExCategoryEntity)) return false;
        if (!super.equals(o)) return false;

        PlanningExCategoryEntity that = (PlanningExCategoryEntity) o;

        if(!that.canEqual(this)) return false;
        if (planningExSubcategoriesByExCatId != null ? !planningExSubcategoriesByExCatId.equals(
                that.planningExSubcategoriesByExCatId) : that.planningExSubcategoriesByExCatId != null)
            return false;

        return true;
    }

    @Override
    public final int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (planningExSubcategoriesByExCatId != null ?
                planningExSubcategoriesByExCatId.hashCode() : 0);
        return result;
    }
}
