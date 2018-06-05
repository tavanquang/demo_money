package com.money.service.impl;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.money.dao.PhieuChiDao;
import com.money.entity.PhieuChi;
import com.money.model.PhieuChiDTO;
import com.money.service.PhieuChiService;


@Transactional
@Service
public class PhieuChiServiceImpl implements PhieuChiService{

	@Autowired
	PhieuChiDao phieuChiDao;

	@Override
	public List<PhieuChiDTO> getAll() {

		Locale locale = new Locale("vi","VN");
		NumberFormat format = NumberFormat.getCurrencyInstance(locale); 
		
		List<PhieuChiDTO> phieuChiDTOs = new ArrayList<PhieuChiDTO>();
		List<PhieuChi> phieuChis = phieuChiDao.getAll();
		for(PhieuChi phieuChi : phieuChis){
			
			PhieuChiDTO phieuChiDTO = new PhieuChiDTO();
			
			phieuChiDTO.setId(phieuChi.getId());
			phieuChiDTO.setDiaChi(phieuChi.getDiaChi());
			phieuChiDTO.setKemTheo(phieuChi.getKemTheo());
			phieuChiDTO.setGiamDoc(phieuChi.getGiamDoc());
			phieuChiDTO.setLyDoChi(phieuChi.getLyDoChi());
			phieuChiDTO.setNgayLapPhieu(phieuChi.getNgayLapPhieu());
			
			phieuChiDTO.setNguoiLapPhieu(phieuChi.getNguoiLapPhieu());
			phieuChiDTO.setNguoiNhanTien(phieuChi.getNguoiNhanTien());
			phieuChiDTO.setSoTien(phieuChi.getSoTien());
			
			phieuChiDTO.setTongtien(format.format(phieuChi.getSoTien()));
			
			phieuChiDTO.setTrangThai(phieuChi.getTrangThai());
			
			phieuChiDTOs.add(phieuChiDTO);
		}
		
		return phieuChiDTOs;
	}

	@Override
	public void AddPhieuChiDTO(PhieuChiDTO phieuChiDTO) {
		
		PhieuChi phieuChi = new PhieuChi();
		
		phieuChi.setId(phieuChiDTO.getId());
		phieuChi.setDiaChi(phieuChiDTO.getDiaChi());
		phieuChi.setKemTheo(phieuChiDTO.getKemTheo());
		phieuChi.setGiamDoc(phieuChiDTO.getGiamDoc());
		phieuChi.setLyDoChi(phieuChiDTO.getLyDoChi());
		phieuChi.setNgayLapPhieu(new Date());
		
		phieuChi.setNguoiLapPhieu(phieuChiDTO.getNguoiLapPhieu());
		phieuChi.setNguoiNhanTien(phieuChiDTO.getNguoiNhanTien());
		phieuChi.setSoTien(phieuChiDTO.getSoTien());
		
		/*
		 * 0. dang xet duyet
		 * 1. da xet duyet
		 * 2. da chi
		 */
		
		phieuChi.setTrangThai(0);
		
		phieuChiDao.AddPhieuChi(phieuChi);
	}

	@Override
	public void EditPhieuChiDTO(PhieuChiDTO phieuChiDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RemovePhieuChiDTO(PhieuChiDTO phieuChiDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PhieuChiDTO getPhieuChiDTO(int id) {
		Locale locale = new Locale("vi","VN");
		NumberFormat format = NumberFormat.getCurrencyInstance(locale); 
		PhieuChi phieuChi = phieuChiDao.getPhieuChi(id);
		
		PhieuChiDTO phieuChiDTO = new PhieuChiDTO();
		
		phieuChiDTO.setId(phieuChi.getId());
		phieuChiDTO.setDiaChi(phieuChi.getDiaChi());
		phieuChiDTO.setKemTheo(phieuChi.getKemTheo());
		phieuChiDTO.setGiamDoc(phieuChi.getGiamDoc());
		phieuChiDTO.setLyDoChi(phieuChi.getLyDoChi());
		phieuChiDTO.setNgayLapPhieu(phieuChi.getNgayLapPhieu());
		
		phieuChiDTO.setNguoiLapPhieu(phieuChi.getNguoiLapPhieu());
		phieuChiDTO.setNguoiNhanTien(phieuChi.getNguoiNhanTien());
		phieuChiDTO.setSoTien(phieuChi.getSoTien());
		phieuChiDTO.setTongtien(format.format(phieuChi.getSoTien()));
		
		phieuChiDTO.setTrangThai(phieuChi.getTrangThai());
		
		return phieuChiDTO;
	}

	@Override
	public void EditTrangThai(PhieuChiDTO phieuChiDTO) {
		// TODO Auto-generated method stub
		PhieuChi phieuChi = phieuChiDao.getPhieuChi(phieuChiDTO.getId());
		if(phieuChi != null){
			phieuChi.setTrangThai(phieuChiDTO.getTrangThai());
		}
	}

	@Override
	public List<PhieuChiDTO> getAllByTrangThai(int trangThai) {
		Locale locale = new Locale("vi","VN");
		NumberFormat format = NumberFormat.getCurrencyInstance(locale); 
		
		List<PhieuChiDTO> phieuChiDTOs = new ArrayList<PhieuChiDTO>();
		List<PhieuChi> phieuChis = phieuChiDao.getAllByTrangThai(trangThai);
		for(PhieuChi phieuChi : phieuChis){
			
			PhieuChiDTO phieuChiDTO = new PhieuChiDTO();
			
			phieuChiDTO.setId(phieuChi.getId());
			phieuChiDTO.setDiaChi(phieuChi.getDiaChi());
			phieuChiDTO.setKemTheo(phieuChi.getKemTheo());
			phieuChiDTO.setGiamDoc(phieuChi.getGiamDoc());
			phieuChiDTO.setLyDoChi(phieuChi.getLyDoChi());
			phieuChiDTO.setNgayLapPhieu(phieuChi.getNgayLapPhieu());
			
			phieuChiDTO.setNguoiLapPhieu(phieuChi.getNguoiLapPhieu());
			phieuChiDTO.setNguoiNhanTien(phieuChi.getNguoiNhanTien());
			phieuChiDTO.setSoTien(phieuChi.getSoTien());
			
			phieuChiDTO.setTongtien(format.format(phieuChi.getSoTien()));
			
			phieuChiDTO.setTrangThai(phieuChi.getTrangThai());
			
			phieuChiDTOs.add(phieuChiDTO);
		}
		
		return phieuChiDTOs;
	}
	
	
}
