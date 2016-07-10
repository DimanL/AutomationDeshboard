package com.automation.dashboard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.LocalDate;
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "AUTOMATION_RESULT")
public class AutomationResult {

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getTestCase() {
		return testCase;
	}

	public void setTestCase(String testCase) {
		this.testCase = testCase;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public LocalDate getRunDate() {
		return runDate;
	}

	public void setRunDate(LocalDate runDate) {
		this.runDate = runDate;
	}

	@Id
    private int id;
	
	@NotEmpty
    @Column(name = "PROJECT", nullable = false)
	private String project;
	
	@NotEmpty
    @Column(name = "TEST_CASE",nullable = false)
	private String testCase;
	
	@NotEmpty
    @Column(name = "STATUS",  nullable = false)
	private String status;
	
	@NotEmpty
    @Column(name = "ENVIRONMENT",nullable = false)
	private String environment;
	
	 @NotNull
	 @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") 
	 @Column(name = "RUN_DATE", nullable = false)
	 @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	 private LocalDate runDate;
	
	
	
	
	
	
}
