package com.dao;

import java.util.List;

import com.pojo.Roles;
import com.pojo.Users;

public interface Userdao {
	public Users find(Users user);  
	public List<Users> list();
	public void delete(Users user);
	public void update(Users user); 
	public void adduser(Users user);
}
