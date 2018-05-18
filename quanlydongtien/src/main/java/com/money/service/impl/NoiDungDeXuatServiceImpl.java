package com.money.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.money.dao.NoiDungDeXuatDao;
import com.money.dao.PhieuDeXuatDao;
import com.money.entity.NoiDungDeXuat;
import com.money.model.NoiDungDeXuatDTO;
import com.money.service.NoiDungDeXuatService;

@Service
@Transactional
public class NoiDungDeXuatServiceImpl implements NoiDungDeXuatService{

	@Autowired
	NoiDungDeXuatDao noiDungDeXuatDao;
	
	@Autowired
	PhieuDeXuatDao phieuDeXuatDao;
	
	@Override
	public List<NoiDungDeXuatDTO> getAll() {
		// TODO Auto-generated method stub
		List<NoiDungDeXuatDTO> noiDungDeXuatDTOs = new ArrayList<NoiDungDeXuatDTO>();
		List<NoiDungDeXuat> noiDungDeXuats = noiDungDeXuatDao.getAll();
		
		for(NoiDungDeXuat noiDungDeXuat : noiDungDeXuats){
			NoiDungDeXuatDTO noiDungDeXuatDTO = new NoiDungDeXuatDTO();
			
			noiDungDeXuatDTO.setId(noiDungDeXuat.getId());
			noiDungDeXuatDTO.setDonGia(noiDungDeXuat.getDonGia());
			noiDungDeXuatDTO.setGhiChu(noiDungDeXuat.getGhiChu());
			noiDungDeXuatDTO.setNoiDungDeXuat(noiDungDeXuat.getNoiDungDeXuat());
			noiDungDeXuatDTO.setSoLuong(noiDungDeXuat.getSoLuong());
			noiDungDeXuatDTO.setSoNgay(noiDungDeXuat.getSoNgay());
			noiDungDeXuatDTO.setThanhTien(noiDungDeXuat.getThanhTien());
			noiDungDeXuatDTO.setIdPhieuDeXuat(noiDungDeXuat.getTblPhieuDeXuat().getId());
		
			noiDungDeXuatDTOs.add(noiDungDeXuatDTO);
		}
		
		
		
		return noiDungDeXuatDTOs;
	}

	@Override
	public void AddNoiDungDeXuatDTO(NoiDungDeXuatDTO noiDungDeXuatDTO) {
		// TODO Auto-generated method stub
		NoiDungDeXuat noiDungDeXuat = new NoiDungDeXuat();
		
		noiDungDeXuat.setId(noiDungDeXuatDTO.getId());
		noiDungDeXuat.setDonGia(noiDungDeXuatDTO.getDonGia());
		noiDungDeXuat.setGhiChu(noiDungDeXuatDTO.getGhiChu());
		noiDungDeXuat.setNoiDungDeXuat(noiDungDeXuatDTO.getNoiDungDeXuat());
		noiDungDeXuat.setSoLuong(noiDungDeXuatDTO.getSoLuong());
		noiDungDeXuat.setSoNgay(noiDungDeXuatDTO.getSoNgay());
		noiDungDeXuat.setThanhTien(noiDungDeXuatDTO.getThanhTien());
		noiDungDeXuat.setTblPhieuDeXuat(phieuDeXuatDao.getPhieuDeXuat(noiDungDeXuatDTO.getIdPhieuDeXuat()));
		
		noiDungDeXuatDao.AddNoiDungDeXuat(noiDungDeXuat);
	}

	@Override
	public void EditNoiDungDeXuatDTO(NoiDungDeXuatDTO noiDungDeXuatDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RemoveNoiDungDeXuatDTO(NoiDungDeXuatDTO noiDungDeXuatDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public NoiDungDeXuatDTO getNoiDungDeXuatDTO(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NoiDungDeXuatDTO> getAllByIdPhieu(String id) {
		List<NoiDungDeXuatDTO> noiDungDeXuatDTOs = new ArrayList<NoiDungDeXuatDTO>();
		List<NoiDungDeXuat> noiDungDeXuats = noiDungDeXuatDao.getAllByIdPhieu(phieuDeXuatDao.getPhieuDeXuat(id));
		
		for(NoiDungDeXuat noiDungDeXuat : noiDungDeXuats){
			NoiDungDeXuatDTO noiDungDeXuatDTO = new NoiDungDeXuatDTO();
			
			noiDungDeXuatDTO.setId(noiDungDeXuat.getId());
			noiDungDeXuatDTO.setDonGia(noiDungDeXuat.getDonGia());
			noiDungDeXuatDTO.setGhiChu(noiDungDeXuat.getGhiChu());
			noiDungDeXuatDTO.setNoiDungDeXuat(noiDungDeXuat.getNoiDungDeXuat());
			noiDungDeXuatDTO.setSoLuong(noiDungDeXuat.getSoLuong());
			noiDungDeXuatDTO.setSoNgay(noiDungDeXuat.getSoNgay());
			noiDungDeXuatDTO.setThanhTien(noiDungDeXuat.getThanhTien());
			noiDungDeXuatDTO.setIdPhieuDeXuat(noiDungDeXuat.getTblPhieuDeXuat().getId());
		
			noiDungDeXuatDTOs.add(noiDungDeXuatDTO);
		}
		
		
		
		return noiDungDeXuatDTOs;
	}

	
	
}
