package com.automation.dashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.automation.dashboard.model.AutomationResult;
import com.automation.dashboard.service.ResultsService;

@RestController
public class AutomationDeshboardRestCon 
{
	@Autowired
	ResultsService resultsService;
	
	@RequestMapping(value = "results/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<List<AutomationResult>> getResults(@PathVariable("id") String id)
	{
		List<AutomationResult> results = resultsService.findAllAutomationResults();
		if(results.isEmpty()){
            return new ResponseEntity<List<AutomationResult>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<AutomationResult>>(results, HttpStatus.OK);
		
	}
	
}
