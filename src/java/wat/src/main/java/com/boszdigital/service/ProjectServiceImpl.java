package com.boszdigital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boszdigital.wat.dao.ProjectDAO;
import com.boszdigital.wat.model.Project;


@Service("createProject")
public class ProjectServiceImpl implements ProjectService
{
	@Autowired
	ProjectDAO projectdao;

	public void createProject(final Project project)
	{
		projectdao.persist(project);
	}

}
