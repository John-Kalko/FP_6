package ua.fp.dao.impl;
import ua.fp.dao.ExSubcategory;
import ua.fp.domain.AccountEntity;
import ua.fp.domain.PlanningExSubcategoryEntity;

import javax.ejb.Stateless;

/**
 * @author ������ �������
 * @version 1.0
 * @created 21-Jun-2013 2:09:32 PM
 */
@Stateless
public class ExSubcategoryDAOImpl extends JpaDAO<PlanningExSubcategoryEntity> implements ExSubcategory {

	public ExSubcategoryDAOImpl(){

    }

    @Override
    protected Class<PlanningExSubcategoryEntity> type() {
        return PlanningExSubcategoryEntity.class;
    }

}