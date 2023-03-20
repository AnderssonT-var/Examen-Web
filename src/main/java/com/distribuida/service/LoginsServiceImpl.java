package com.distribuida.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.LoginsDAO;
import com.distribuida.dao.UsuarioDAO;
import com.distribuida.entities.Logins;
import com.distribuida.entities.Usuario;

@Service
public class LoginsServiceImpl implements LoginsService {

	
	@Autowired
	private UsuarioDAO usuariosDAO;
	
	@Autowired
	private LoginsDAO loginsDAO;
	
	
	
	@Override
	public List<Logins> findAll() {
		// TODO Auto-generated method stub
		return loginsDAO.findAll();
	}

	@Override
	public Logins findOne(int id) {
		// TODO Auto-generated method stub
		return loginsDAO.findOne(id);
	}

	@Override
	public void add(Logins logins) {
		// TODO Auto-generated method stub
		loginsDAO.add(logins);
	}

	@Override
	public void up(Logins logins) {
		// TODO Auto-generated method stub
		loginsDAO.up(logins);
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		loginsDAO.del(id);
	}

	@Override
	public void add(Date fechaIngreso, Date fechaSalida, double tiempo, String usuario, String clave, int id_usuario) {
		// TODO Auto-generated method stub			
		Logins login = new Logins(fechaIngreso, fechaSalida, tiempo, usuario, clave);
		Usuario usuario1 = usuariosDAO.findOne(id_usuario);		
		login.setUsuario1(usuario1);		
		loginsDAO.add(login);
		
	}

	@Override
	public void up(int id, Date fechaIngreso, Date fechaSalida, double tiempo, String usuario, String clave,
			int id_usuario) {
		// TODO Auto-generated method stub
		Logins login = new Logins(id, fechaIngreso, fechaSalida, tiempo, usuario, clave);
		Usuario usuario1 = usuariosDAO.findOne(id_usuario);		
		login.setUsuario1(usuario1);				
		loginsDAO.up(login);
		
	}

	@Override
	public Logins validar(String usuario, String clave) {
		
		Logins login=loginsDAO.validar(usuario, clave);
		
		return login;
	}
	
	
	
	

}
