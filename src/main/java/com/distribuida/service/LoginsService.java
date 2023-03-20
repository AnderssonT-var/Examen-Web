package com.distribuida.service;

import java.util.Date;
import java.util.List;

import com.distribuida.entities.Logins;

public interface LoginsService {

	
	public List<Logins> findAll();
	
	public Logins findOne(int id);
	
	public void add(Logins logins);
	
	public void up(Logins logins);
	
	public void del(int id);
	
	public void add(Date fechaIngreso, Date fechaSalida, double tiempo, String usuario, String clave, int id_usuario);
	
	public void up(int id, Date fechaIngreso, Date fechaSalida, double tiempo, String usuario, String clave, int id_usuario);
	
	
	public Logins validar( String usuario, String clave);
	
}
