package com.money.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.money.model.PhieuChiDTO;
import com.money.model.PhieuDeXuatDTO;
import com.money.service.PhieuDeXuatService;

@Controller
public class PhieuDeXuatController {

	@Autowired
	PhieuDeXuatService phieuDeXuatService;
	
	@GetMapping(value = "/danh-sach-phieu-de-xuat")
	public String getAllPhieuDeXuat(Model model){
		List<PhieuDeXuatDTO> listPDX = phieuDeXuatService.getAll();
		
		model.addAttribute("listPDX", listPDX);
		return "admin/listPhieuDeXuat";
	}
	
	@GetMapping(value = "/chi-tiet-phieu-de-xuat")
	public String ChiTietPhieuChi(Model model, 
			@RequestParam(name="id",required=true) String id) {

		PhieuDeXuatDTO PhieuDeXuatDTO = phieuDeXuatService.getPhieuDeXuatDTO(id);
		model.addAttribute("PhieuDeXuatDTO", PhieuDeXuatDTO);

		return "admin/chiTietPhieuDeXuat";
	}
	
}
