package com.boszdigital.wat.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public abstract class GenericDAOImpl<T, ID extends Serializable> implements GenericDAO<T, ID>
{

	private final Class<T> persistentClass;

	@PersistenceContext
	protected EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public GenericDAOImpl()
	{
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public Class<T> getPersistentClass()
	{
		return persistentClass;
	}

	public T loadById(final ID id)
	{
		return entityManager.find(persistentClass, id);
	}

	public void persist(final T entity)
	{
		entityManager.persist(entity);
	}

	public void update(final T entity)
	{
		entityManager.merge(entity);
	}

	public void delete(final T entity)
	{
		entityManager.remove(entity);
	}

	@SuppressWarnings("unchecked")
	public List<T> loadAll()
	{
		return entityManager.createQuery("Select t from " + persistentClass.getSimpleName() + " t").getResultList();
	}
}
