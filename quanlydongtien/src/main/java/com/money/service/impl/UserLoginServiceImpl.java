package com.money.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.money.dao.AdminDao;
import com.money.entity.Admin;

@Service
@Transactional
public class UserLoginServiceImpl implements UserDetailsService{

	@Autowired
	AdminDao adminDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Admin admin =adminDao.getAdmin(username);
		
		if(admin == null)
		{
			throw new UsernameNotFoundException("no user");
		}
		
		List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
		
		authorities.add(new SimpleGrantedAuthority(admin.getRoles()));
		
		UserDetails details = new User(admin.getUsername(), admin.getPassword(), true, true, true, true, authorities);
		
		return details;
	}
	
	

}
