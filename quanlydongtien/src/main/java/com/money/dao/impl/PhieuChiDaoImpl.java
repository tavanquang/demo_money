package com.money.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.money.dao.PhieuChiDao;
import com.money.entity.PhieuChi;

@Transactional
@Repository
public class PhieuChiDaoImpl implements PhieuChiDao{

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public List<PhieuChi> getAll() {
		String jql = "SELECT p FROM PhieuChi p";
		return entityManager.createQuery(jql, PhieuChi.class).getResultList();
	}

	@Override
	public void AddPhieuChi(PhieuChi phieuChi) {
		// TODO Auto-generated method stub
		entityManager.persist(phieuChi);
	}

	@Override
	public void EditPhieuChi(PhieuChi phieuChi) {
		// TODO Auto-generated method stub
		entityManager.merge(phieuChi);
	}

	@Override
	public void RemovePhieuChi(PhieuChi phieuChi) {
		// TODO Auto-generated method stub
		entityManager.remove(phieuChi);
	}

	@Override
	public PhieuChi getPhieuChi(int id) {
		// TODO Auto-generated method stub
		return entityManager.find(PhieuChi.class, id);
	}

	@Override
	public List<PhieuChi> getAllByTrangThai(int trangThai) {
		String jql = "SELECT p FROM PhieuChi p where p.trangThai = ?";
		return entityManager.createQuery(jql, PhieuChi.class).setParameter(1, trangThai).getResultList();
	
	}

}
