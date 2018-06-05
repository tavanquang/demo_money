package com.money.dao;

import java.util.List;

import com.money.entity.PhieuChi;

public interface PhieuChiDao {

	public List<PhieuChi> getAll();
	
	public void AddPhieuChi(PhieuChi phieuChi);
	
	public void EditPhieuChi(PhieuChi phieuChi);
	
	public void RemovePhieuChi(PhieuChi phieuChi);
	
	public PhieuChi getPhieuChi(int id);

	public List<PhieuChi> getAllByTrangThai(int trangThai);
	
}
