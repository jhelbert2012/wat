package com.boszdigital.wat.dao;

import org.springframework.stereotype.Repository;

import com.boszdigital.wat.model.Project;


@Repository
public class ProjectDAOImpl extends GenericDAOImpl<Project, Long> implements ProjectDAO
{
	public ProjectDAOImpl()
	{
		// TODO Auto-generated constructor stub
	}
}
