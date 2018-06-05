package com.money.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.money.model.PhieuChiDTO;
import com.money.service.PhieuChiService;

@Controller
public class PhieuChiController {

	@Autowired
	PhieuChiService phieuChiService;

	@GetMapping(value = "/danh-sach-phieu-chi")
	public String listPhieuChi(Model model) {

		List<PhieuChiDTO> listPC = phieuChiService.getAll();
		model.addAttribute("listPC", listPC);
		
		return "admin/listPhieuChi";
	}

	@GetMapping(value = "/chi-tiet-phieu-chi")
	public String ChiTietPhieuChi(Model model, 
			@RequestParam(name="id",required=true) int id) {

		PhieuChiDTO phieuChiDTO = phieuChiService.getPhieuChiDTO(id);
		model.addAttribute("phieuChiDTO", phieuChiDTO);

		return "admin/chiTietPhieuChi";
	}

	
	@GetMapping(value = "/chon-danh-sach-phieu-chi")
	public String luaChon(Model model, @ModelAttribute(name="luaChon") int trangThai) {
		List<PhieuChiDTO> listPC = new ArrayList<PhieuChiDTO>();
		if(trangThai == 4){
			listPC = phieuChiService.getAll();
		}else{
			 listPC = phieuChiService.getAllByTrangThai(trangThai);
		}
		model.addAttribute("listPC", listPC);

		return "admin/listPhieuChi";
	}
	
	
	
	@GetMapping(value = "/them-phieu-chi")
	public String themphieuchi(Model model) {
		PhieuChiDTO phieuChiDTO = new PhieuChiDTO();
		model.addAttribute("phieuChiDTO", phieuChiDTO);
		return "admin/themPhieuChi";
	}
	
	@PostMapping(value = "/them-phieu-chi")
	public String themphieuchi(Model model, @ModelAttribute(name="phieuChiDTO")PhieuChiDTO phieuChiDTO) {

		phieuChiService.AddPhieuChiDTO(phieuChiDTO);
		model.addAttribute("msg", "1");
		return "redirect:/danh-sach-phieu-chi";
	}
	
	
	
	
	
	
}
