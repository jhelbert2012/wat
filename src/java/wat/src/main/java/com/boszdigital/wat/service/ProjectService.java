package com.boszdigital.wat.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.boszdigital.wat.model.Project;


@Service("projectService")
public interface ProjectService
{

	public void createProject(final Project project);

	public List<Project> findAllProjects();

	/**
	 * Gets a project by its id
	 * @param id The id of the project
	 * @return Project data
	 */
	public Project getProject(long id);
}
