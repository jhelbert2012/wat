package com.boszdigital.wat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boszdigital.service.ProjectService;
import com.boszdigital.wat.model.Project;


public class ProjectsController
{
	@Autowired
	ProjectService projectService;

	@RequestMapping(value = "/projects/", method = RequestMethod.GET)
	public @ResponseBody
	List<Project> getProjects()
	{
		return projectService.findAllProjects();
	}
}
