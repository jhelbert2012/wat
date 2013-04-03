package com.boszdigital.wat.model;

import java.util.List;


public class User
{
	int id;
	String email;
	List<Project> projects;

	public int getId()
	{
		return id;
	}

	public void setId(final int id)
	{
		this.id = id;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(final String email)
	{
		this.email = email;
	}

	public List<Project> getProjects()
	{
		return projects;
	}

	public void setProjects(final List<Project> projects)
	{
		this.projects = projects;
	}



}
