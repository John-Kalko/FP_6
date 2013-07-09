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
@javax.persistence.Table(name = "PLANNING_IN_CATEGORY", schema = "FP", catalog = "")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class PlanningInCategoryEntity extends Category {

    @Id
    @Column(name = "IN_CAT_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Plan_in_gen")
    @SequenceGenerator(name = "Plan_in_gen", sequenceName = "S_PLANNING_IN_CATEGORY", allocationSize = 1)
    private int exCatId;

    @OneToMany(mappedBy = "planningInCategoryByInCatId")
    private List<PlanningInSubcategoryEntity> planningInSubcategoriesByInCatId;

    public void setPlanningInSubcategoriesByInCatId(List<PlanningInSubcategoryEntity> planningInSubcategoriesByInCatId) {
        this.planningInSubcategoriesByInCatId = planningInSubcategoriesByInCatId;
    }

    public int getExCatId() {
        return exCatId;
    }

    public List<PlanningInSubcategoryEntity> getPlanningInSubcategoriesByInCatId() {
        return planningInSubcategoriesByInCatId;
    }

    @Override
    public boolean canEqual(Object other) {
        return (other instanceof PlanningInCategoryEntity);
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlanningInCategoryEntity)) return false;
        if (!super.equals(o)) return false;

        PlanningInCategoryEntity that = (PlanningInCategoryEntity) o;

        if(!that.canEqual(this)) return false;
        if (planningInSubcategoriesByInCatId != null ? !planningInSubcategoriesByInCatId.equals(that.planningInSubcategoriesByInCatId) : that.planningInSubcategoriesByInCatId != null)
            return false;

        return true;
    }

    @Override
    public final int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (planningInSubcategoriesByInCatId != null ? planningInSubcategoriesByInCatId.hashCode() : 0);
        return result;
    }
}
