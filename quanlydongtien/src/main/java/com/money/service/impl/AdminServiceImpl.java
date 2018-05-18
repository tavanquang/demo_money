package com.money.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.money.dao.AdminDao;
import com.money.entity.Admin;
import com.money.model.AdminDTO;
import com.money.service.AdminService;

@Transactional
@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	AdminDao adminDao;
	
	@Override
	public List<AdminDTO> getAll() {
		List<AdminDTO> adminDTOs = new ArrayList<>();
		
		List<Admin> admins = adminDao.getAll();
		
		for(Admin admin : admins){
			AdminDTO adminDTO = new AdminDTO();
			
			adminDTO.setUsername(admin.getUsername());
			adminDTO.setPassword(admin.getPassword());
			adminDTO.setRoles(admin.getRoles());
			
			adminDTOs.add(adminDTO);
		}
		
		return adminDTOs;
	}

	@Override
	public void AddAdminDTO(AdminDTO adminDTO) {
		// TODO Auto-generated method stub
		Admin admin = new Admin();
		
		admin.setUsername(adminDTO.getUsername());
		admin.setPassword(adminDTO.getPassword());
		admin.setRoles(adminDTO.getRoles());
		
		adminDao.AddAdmin(admin);
		
	}

	@Override
	public void EditAdminDTO(AdminDTO adminDTO) {
		// TODO Auto-generated method stub
		Admin admin = adminDao.getAdmin(adminDTO.getUsername());
		if(admin != null){
			admin.setUsername(adminDTO.getUsername());
			admin.setPassword(adminDTO.getPassword());
			admin.setRoles(adminDTO.getRoles());
			
			adminDao.EditAdmin(admin);
		}
	}

	@Override
	public void RemoveAdminDTO(String username) {
		// TODO Auto-generated method stub
		Admin admin = adminDao.getAdmin(username);
		if(admin != null){
			adminDao.RemoveAdmin(admin);
		}
	}

	@Override
	public AdminDTO getAdminDTO(String username) {
		Admin admin = adminDao.getAdmin(username);
		
		AdminDTO adminDTO = new AdminDTO();
		
		adminDTO.setUsername(admin.getUsername());
		adminDTO.setPassword(admin.getPassword());
		adminDTO.setRoles(admin.getRoles());
		
		return adminDTO;
	}

	
	
}
