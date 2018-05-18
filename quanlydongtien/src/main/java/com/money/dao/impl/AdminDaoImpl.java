package com.money.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.money.dao.AdminDao;
import com.money.entity.Admin;

@Transactional
@Repository
public class AdminDaoImpl implements AdminDao{

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public List<Admin> getAll() {
		String jql = "SELECT a FROM Admin a";
		return entityManager.createQuery(jql, Admin.class).getResultList();
	}

	@Override
	public void AddAdmin(Admin admin) {
		// TODO Auto-generated method stub
		entityManager.persist(admin);
	}

	@Override
	public void EditAdmin(Admin admin) {
		// TODO Auto-generated method stub
		entityManager.merge(admin);
	}

	@Override
	public void RemoveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		entityManager.remove(admin);
	}

	@Override
	public Admin getAdmin(String username) {
		// TODO Auto-generated method stub
		return entityManager.find(Admin.class, username);
	}

	
	
}
