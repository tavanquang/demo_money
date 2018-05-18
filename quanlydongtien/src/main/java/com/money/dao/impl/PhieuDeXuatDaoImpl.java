package com.money.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.money.dao.PhieuDeXuatDao;
import com.money.entity.PhieuDeXuat;

@Transactional
@Repository
public class PhieuDeXuatDaoImpl implements PhieuDeXuatDao{

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<PhieuDeXuat> getAll() {
		// TODO Auto-generated method stub
		String jql = "SELECT p FROM PhieuDeXuat p";
		return entityManager.createQuery(jql,PhieuDeXuat.class).getResultList();
	}

	@Override
	public void AddPhieuDeXuat(PhieuDeXuat phieuDeXuat) {
		// TODO Auto-generated method stub
		entityManager.persist(phieuDeXuat);
	}

	@Override
	public void EditPhieuDeXuat(PhieuDeXuat phieuDeXuat) {
		// TODO Auto-generated method stub
		entityManager.merge(phieuDeXuat);
	}

	@Override
	public void RemovePhieuDeXuat(PhieuDeXuat phieuDeXuat) {
		// TODO Auto-generated method stub
		entityManager.remove(phieuDeXuat);
	}

	@Override
	public PhieuDeXuat getPhieuDeXuat(String id) {
		// TODO Auto-generated method stub
		return entityManager.find(PhieuDeXuat.class, id);
	}

	
}
