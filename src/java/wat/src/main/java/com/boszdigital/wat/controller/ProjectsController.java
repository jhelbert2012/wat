package com.boszdigital.wat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boszdigital.wat.dto.WatList;
import com.boszdigital.wat.service.ProjectService;


@Controller
public class ProjectsController
{
	@Autowired
	ProjectService projectService;

	@RequestMapping(value = "/projects", method = RequestMethod.GET)
	public @ResponseBody WatList getProjects() {
		WatList list = new WatList();
		list.setProjectList(projectService.findAllProjects());
		list.setListSize(100);
		return list;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/projects/{id}", method=RequestMethod.GET)
	public @ResponseBody Project getProject(@PathVariable("id") long id) {
		
		return projectService.getProject(id);
	}
}
