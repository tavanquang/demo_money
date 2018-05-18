package com.money.dao;

import java.util.List;

import com.money.entity.Admin;

public interface AdminDao {

	public List<Admin> getAll();
	
	public void AddAdmin(Admin admin);
	
	public void EditAdmin(Admin admin);
	
	public void RemoveAdmin(Admin admin);
	
	public Admin getAdmin(String username);
	
}
