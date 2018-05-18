package com.money.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.money.dao.NoiDungDeXuatDao;
import com.money.entity.NoiDungDeXuat;
import com.money.entity.PhieuDeXuat;

@Transactional
@Repository
public class NoiDungDeXuatDaoImpl implements NoiDungDeXuatDao{

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<NoiDungDeXuat> getAll() {
		// TODO Auto-generated method stub
		String jql = "SELECT n FROM NoiDungDeXuat n";
		return entityManager.createQuery(jql,NoiDungDeXuat.class).getResultList();
	}

	@Override
	public void AddNoiDungDeXuat(NoiDungDeXuat noiDungDeXuat) {
		// TODO Auto-generated method stub
		entityManager.persist(noiDungDeXuat);
	}

	@Override
	public void EditNoiDungDeXuat(NoiDungDeXuat noiDungDeXuat) {
		// TODO Auto-generated method stub
		entityManager.merge(noiDungDeXuat);
	}

	@Override
	public void RemoveNoiDungDeXuat(NoiDungDeXuat noiDungDeXuat) {
		// TODO Auto-generated method stub
		entityManager.remove(noiDungDeXuat);
	}

	@Override
	public NoiDungDeXuat getNoiDungDeXuat(int id) {
		// TODO Auto-generated method stub
		return entityManager.find(NoiDungDeXuat.class, id);
	}

	@Override
	public List<NoiDungDeXuat> getAllByIdPhieu(PhieuDeXuat phieuDeXuat) {
		String jql = "SELECT n FROM NoiDungDeXuat n where n.tblPhieuDeXuat = ?";
		return entityManager.createQuery(jql,NoiDungDeXuat.class).setParameter(1, phieuDeXuat).getResultList();
	
	}
	
}
