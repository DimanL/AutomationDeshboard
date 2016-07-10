package com.automation.dashboard.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.automation.dashboard.model.AutomationResult;
@Repository("ResultsDao")
public class ResultsDaoImpl extends AbstractDao<Integer, AutomationResult> implements ResultsDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<AutomationResult> findAllresults() {
		Criteria criteria = createEntityCriteria();
        return (List<AutomationResult>) criteria.list();
	}

}
