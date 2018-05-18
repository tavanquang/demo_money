package com.money.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.money.model.PhieuChiDTO;
import com.money.service.PhieuChiService;

@RestController
@RequestMapping(value="/api", method =RequestMethod.GET)
public class PhieuChiRestController {

	@Autowired
	PhieuChiService phieuChiService;
	
	
	@GetMapping(value="/danh-sach-phieu-chi")
	public List<PhieuChiDTO> getAllPhieuChi(){
		
		List<PhieuChiDTO> phieuChiDTOs = phieuChiService.getAll();
		
		return phieuChiDTOs;
	}
	
	@PostMapping(value="/them-phieu-chi")
	public void AddPhieuChi(@RequestBody PhieuChiDTO phieuChiDTO){
		
		phieuChiService.AddPhieuChiDTO(phieuChiDTO);
		
	}
	
	@PostMapping(value="/chuyen-trang-thai-phieu-chi")
	public void EditTrangThai(@RequestBody PhieuChiDTO phieuChiDTO){
		
		phieuChiService.EditTrangThai(phieuChiDTO);
		
	}
	
	@GetMapping(value="/phieu-chi/{id}")
	public PhieuChiDTO getPhieuChi(
			@PathVariable(name="id") int id){
		
		return  phieuChiService.getPhieuChiDTO(id);
	}
	
}











