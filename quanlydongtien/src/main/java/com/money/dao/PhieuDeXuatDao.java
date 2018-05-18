package com.money.dao;

import java.util.List;

import com.money.entity.PhieuDeXuat;

public interface PhieuDeXuatDao {

	public List<PhieuDeXuat> getAll();

	
	
	public void AddPhieuDeXuat(PhieuDeXuat phieuDeXuat);

	public void EditPhieuDeXuat(PhieuDeXuat phieuDeXuat);

	public void RemovePhieuDeXuat(PhieuDeXuat phieuDeXuat);

	public PhieuDeXuat getPhieuDeXuat(String id);

}
