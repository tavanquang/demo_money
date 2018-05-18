package com.money.service;

import java.util.List;

import com.money.model.PhieuChiDTO;

public interface PhieuChiService {

	public List<PhieuChiDTO> getAll();

	public void AddPhieuChiDTO(PhieuChiDTO phieuChiDTO);

	public void EditPhieuChiDTO(PhieuChiDTO phieuChiDTO);

	public void RemovePhieuChiDTO(PhieuChiDTO phieuChiDTO);

	public PhieuChiDTO getPhieuChiDTO(int id);

	public void EditTrangThai(PhieuChiDTO phieuChiDTO);
	
}
