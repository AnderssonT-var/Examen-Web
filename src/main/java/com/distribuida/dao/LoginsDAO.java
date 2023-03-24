package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Logins;

public interface LoginsDAO {

	public List<Logins> findAll();
	
	public Logins findOne(int id);
	
	public void add(Logins login);
	
	public void up(Logins login);
	
	public void del(int id);
	
	public Logins validar( String usuario, String clave);
	
}
	

