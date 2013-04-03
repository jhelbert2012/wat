package com.boszdigital.wat.model;

import java.io.Serializable;


public class Project implements Serializable
{
	private Long id;
	private String name;
	private String url;

	public Project()
	{
		// TODO Auto-generated constructor stub
	}

	public Long getId()
	{
		return id;
	}

	public void setId(final Long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl(final String url)
	{
		this.url = url;
	}

}
