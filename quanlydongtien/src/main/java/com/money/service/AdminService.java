package com.money.service;

import java.util.List;

import com.money.model.AdminDTO;

public interface AdminService {

	public List<AdminDTO> getAll();

	public void AddAdminDTO(AdminDTO adminDTO);

	public void EditAdminDTO(AdminDTO adminDTO);

	public void RemoveAdminDTO(String username);

	public AdminDTO getAdminDTO(String username);
}
