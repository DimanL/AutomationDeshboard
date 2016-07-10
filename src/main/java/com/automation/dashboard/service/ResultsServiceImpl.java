package com.automation.dashboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.automation.dashboard.dao.ResultsDao;
import com.automation.dashboard.model.AutomationResult;
@Service("ResultsService")
@Transactional
public class ResultsServiceImpl implements ResultsService {
	
	
	@Autowired
	private ResultsDao resultsDao;
	@Override
	public List<AutomationResult> findAllAutomationResults() {
		
		return resultsDao.findAllresults();
	}

}
