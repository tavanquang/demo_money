package com.money.api;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.money.model.NoiDungDeXuatDTO;
import com.money.model.PhieuDeXuatDTO;
import com.money.service.NoiDungDeXuatService;
import com.money.service.PhieuDeXuatService;

@RestController
@RequestMapping(value="/api", method =RequestMethod.GET)
public class PhieuDeXuatRestController {

	@Autowired
	PhieuDeXuatService phieuDeXuatService;
	
	@Autowired
	NoiDungDeXuatService noiDungDeXuatService;
	
	@GetMapping(value="/danh-sach-phieu-de-xuat")
	public List<PhieuDeXuatDTO> getAllPhieuDeXuat(){
		
		List<PhieuDeXuatDTO> phieuDeXuatDTOs = phieuDeXuatService.getAll();
		
		return phieuDeXuatDTOs;
	}
	
	
	@PostMapping(value="/them-phieu-de-xuat")
	public void AddPhieuDeXuatDTO(@RequestBody PhieuDeXuatDTO phieuDeXuatDTO){
		String id = new Date().toString();
		phieuDeXuatDTO.setId(id);
		double tongTien = 0;
		
		List<NoiDungDeXuatDTO> noiDungDeXuatDTOs = phieuDeXuatDTO.getNoiDungDeXuats();
		
		for(NoiDungDeXuatDTO noiDungDeXuatDTO : noiDungDeXuatDTOs){
			noiDungDeXuatDTO.setIdPhieuDeXuat(id);
			noiDungDeXuatDTO.setThanhTien(noiDungDeXuatDTO.getDonGia() * noiDungDeXuatDTO.getSoLuong());
			noiDungDeXuatService.AddNoiDungDeXuatDTO(noiDungDeXuatDTO);
			tongTien += noiDungDeXuatDTO.getThanhTien();
		}
		
		phieuDeXuatDTO.setTongTien(tongTien);
		phieuDeXuatService.AddPhieuDeXuatDTO(phieuDeXuatDTO);
		
	}
	
	@PostMapping(value="/chuyen-trang-thai-phieu-de-xuat")
	public void EditTrangThaiPhieuDeXuat(@RequestBody PhieuDeXuatDTO phieuDeXuatDTO){
		
		phieuDeXuatService.EditTrangThai(phieuDeXuatDTO);
		
	}
	
	@GetMapping(value="/phieu-de-xuat/{id}")
	public PhieuDeXuatDTO getPhieuChi(
			@PathVariable(name="id") String id){
		
		return  phieuDeXuatService.getPhieuDeXuatDTO(id);
	}
	
}
