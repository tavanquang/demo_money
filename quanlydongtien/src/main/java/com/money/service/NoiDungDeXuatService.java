package com.money.service;

import java.util.List;

import com.money.model.NoiDungDeXuatDTO;

public interface NoiDungDeXuatService {

	public List<NoiDungDeXuatDTO> getAll();
	
	public List<NoiDungDeXuatDTO> getAllByIdPhieu(String id);

	public void AddNoiDungDeXuatDTO(NoiDungDeXuatDTO noiDungDeXuatDTO);

	public void EditNoiDungDeXuatDTO(NoiDungDeXuatDTO noiDungDeXuatDTO);

	public void RemoveNoiDungDeXuatDTO(NoiDungDeXuatDTO noiDungDeXuatDTO);

	public NoiDungDeXuatDTO getNoiDungDeXuatDTO(int id);

}
