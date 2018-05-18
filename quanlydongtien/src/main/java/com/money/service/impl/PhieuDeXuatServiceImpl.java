package com.money.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.money.dao.NoiDungDeXuatDao;
import com.money.dao.PhieuDeXuatDao;
import com.money.entity.NoiDungDeXuat;
import com.money.entity.PhieuDeXuat;
import com.money.model.NoiDungDeXuatDTO;
import com.money.model.PhieuDeXuatDTO;
import com.money.service.PhieuDeXuatService;

@Service
@Transactional
public class PhieuDeXuatServiceImpl implements PhieuDeXuatService{

	@Autowired
	PhieuDeXuatDao phieuDeXuatDao;
	
	@Autowired
	NoiDungDeXuatDao noiDungDeXuatDao;

	@Override
	public List<PhieuDeXuatDTO> getAll() {
		// TODO Auto-generated method stub
		List<PhieuDeXuatDTO> phieuDeXuatDTOs = new ArrayList<PhieuDeXuatDTO>();
		List<PhieuDeXuat> phieuDeXuats = phieuDeXuatDao.getAll();
		
		for(PhieuDeXuat phieuDeXuat : phieuDeXuats){
		
			PhieuDeXuatDTO phieuDeXuatDTO = new PhieuDeXuatDTO();
			
			phieuDeXuatDTO.setId(phieuDeXuat.getId());
			phieuDeXuatDTO.setGiamDoc(phieuDeXuat.getGiamDoc());
			phieuDeXuatDTO.setKinhGui(phieuDeXuat.getKinhGui());
			
			phieuDeXuatDTO.setNgayBatDau(phieuDeXuat.getNgayBatDau());
			phieuDeXuatDTO.setNgayHoanThanh(phieuDeXuat.getNgayHoanThanh());
			phieuDeXuatDTO.setNguoiDeNghi(phieuDeXuat.getNguoiDeNghi());
			phieuDeXuatDTO.setNgayDeXuat(phieuDeXuat.getNgayDeXuat());
			
			
			phieuDeXuatDTO.setNguoiKeToan(phieuDeXuat.getNguoiKeToan());
			phieuDeXuatDTO.setTongTien(phieuDeXuat.getTongTien());
			phieuDeXuatDTO.setyKienLanhDao(phieuDeXuat.getYKienLanhDao());
			phieuDeXuatDTO.setTrangThai(phieuDeXuat.getTrangThai());
			
			phieuDeXuatDTOs.add(phieuDeXuatDTO);
		
		}
		
		return phieuDeXuatDTOs;
	}

	@Override
	public void AddPhieuDeXuatDTO(PhieuDeXuatDTO phieuDeXuatDTO) {
		// TODO Auto-generated method stub
		PhieuDeXuat phieuDeXuat = new PhieuDeXuat();
		
		phieuDeXuat.setId(phieuDeXuatDTO.getId());
		phieuDeXuat.setGiamDoc(phieuDeXuatDTO.getGiamDoc());
		phieuDeXuat.setKinhGui(phieuDeXuatDTO.getKinhGui());
		
		phieuDeXuat.setNgayBatDau(phieuDeXuatDTO.getNgayBatDau());
		phieuDeXuat.setNgayHoanThanh(phieuDeXuatDTO.getNgayHoanThanh());
		phieuDeXuat.setNguoiDeNghi(phieuDeXuatDTO.getNguoiDeNghi());
		phieuDeXuat.setNgayDeXuat(phieuDeXuatDTO.getNgayDeXuat());
		
		
		phieuDeXuat.setNguoiKeToan(phieuDeXuatDTO.getNguoiKeToan());
		phieuDeXuat.setTongTien(phieuDeXuatDTO.getTongTien());
		phieuDeXuat.setYKienLanhDao(phieuDeXuatDTO.getyKienLanhDao());
		
		/*
		 * 0. dang xet duyet
		 * 1. da xet duyet
		 * 2. da chi
		 */
		
		phieuDeXuat.setTrangThai(0);
		
		phieuDeXuatDao.AddPhieuDeXuat(phieuDeXuat);
		
	}

	@Override
	public void EditPhieuDeXuatDTO(PhieuDeXuatDTO phieuDeXuatDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RemovePhieuDeXuatDTO(PhieuDeXuatDTO phieuDeXuatDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PhieuDeXuatDTO getPhieuDeXuatDTO(String id) {
		// TODO Auto-generated method stub
		PhieuDeXuat phieuDeXuat = phieuDeXuatDao.getPhieuDeXuat(id);
		
		PhieuDeXuatDTO phieuDeXuatDTO = new PhieuDeXuatDTO();
		
		phieuDeXuatDTO.setId(phieuDeXuat.getId());
		phieuDeXuatDTO.setGiamDoc(phieuDeXuat.getGiamDoc());
		phieuDeXuatDTO.setKinhGui(phieuDeXuat.getKinhGui());
		
		phieuDeXuatDTO.setNgayBatDau(phieuDeXuat.getNgayBatDau());
		phieuDeXuatDTO.setNgayHoanThanh(phieuDeXuat.getNgayHoanThanh());
		phieuDeXuatDTO.setNguoiDeNghi(phieuDeXuat.getNguoiDeNghi());
		phieuDeXuatDTO.setNgayDeXuat(phieuDeXuat.getNgayDeXuat());
		
		
		phieuDeXuatDTO.setNguoiKeToan(phieuDeXuat.getNguoiKeToan());
		phieuDeXuatDTO.setTongTien(phieuDeXuat.getTongTien());
		phieuDeXuatDTO.setyKienLanhDao(phieuDeXuat.getYKienLanhDao());
		phieuDeXuatDTO.setTrangThai(phieuDeXuat.getTrangThai());
		
		
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
		
		phieuDeXuatDTO.setNoiDungDeXuats(noiDungDeXuatDTOs);
		
		return phieuDeXuatDTO;
	}

	@Override
	public void EditTrangThai(PhieuDeXuatDTO phieuDeXuatDTO) {
		// TODO Auto-generated method stub
		PhieuDeXuat phieuDeXuat = phieuDeXuatDao.getPhieuDeXuat(phieuDeXuatDTO.getId());
		phieuDeXuat.setTrangThai(phieuDeXuatDTO.getTrangThai());
	}
	
	
}
