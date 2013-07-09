package ua.fp.dao.impl;
import ua.fp.dao.InSubcategory;
import ua.fp.domain.PlanningInCategoryEntity;
import ua.fp.domain.PlanningInSubcategoryEntity;

import javax.ejb.Stateless;

/**
 * @author ������ �������
 * @version 1.0
 * @created 21-Jun-2013 2:09:32 PM
 */
@Stateless
public class InSubcatedoryDAOImpl extends JpaDAO<PlanningInSubcategoryEntity> implements InSubcategory {

	public InSubcatedoryDAOImpl(){

	}

    @Override
    protected Class<PlanningInSubcategoryEntity> type() {
        return PlanningInSubcategoryEntity.class;
    }

}