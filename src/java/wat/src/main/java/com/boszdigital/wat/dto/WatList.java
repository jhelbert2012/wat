package com.boszdigital.wat.dto;

import java.util.ArrayList;
import java.util.List;

import com.boszdigital.wat.model.Project;

public class WatList {
	
	private int listSize = 0;
	
	private List<Project> projectList = new ArrayList<Project>();

	
	public int getListSize() {
	  return listSize;
  }

	public void setListSize(int listSize) {
	  this.listSize = listSize;
  }

	public List<Project> getProjectList() {
	  return projectList;
  }

	public void setProjectList(List<Project> projectList) {
	  this.projectList = projectList;
  }

}
