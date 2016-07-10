package com.automation.dashboard.dao;

import java.util.List;

import com.automation.dashboard.model.AutomationResult;

public interface ResultsDao 
{
	List<AutomationResult> findAllresults();
}
