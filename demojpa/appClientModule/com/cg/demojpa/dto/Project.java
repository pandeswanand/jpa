package com.cg.demojpa.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jpa_project")
public class Project {

	@Id
	@Column(name="project_id")
	private Integer projectId;
	@Column(name="project_name")
	private String projectName;
	@Column(name="project_cost")
	private Double projectCost;
	
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Double getProjectCost() {
		return projectCost;
	}
	public void setProjectCost(Double projectCost) {
		this.projectCost = projectCost;
	}
	public Project(Integer projectId, String projectName, Double projectCost) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectCost = projectCost;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectCost=" + projectCost
				+ "]";
	}
}
