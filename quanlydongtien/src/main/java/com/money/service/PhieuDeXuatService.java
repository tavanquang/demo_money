package com.money.service;

import java.util.List;

import com.money.model.PhieuDeXuatDTO;

public interface PhieuDeXuatService {

	public List<PhieuDeXuatDTO> getAll();

	public void AddPhieuDeXuatDTO(PhieuDeXuatDTO phieuDeXuatDTO);

	public void EditPhieuDeXuatDTO(PhieuDeXuatDTO phieuDeXuatDTO);

	public void RemovePhieuDeXuatDTO(PhieuDeXuatDTO phieuDeXuatDTO);

	public PhieuDeXuatDTO getPhieuDeXuatDTO(String id);

	public void EditTrangThai(PhieuDeXuatDTO phieuDeXuatDTO);
}
