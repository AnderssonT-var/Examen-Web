package com.distribuida.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.distribuida.dao.UsuarioDAO;
import com.distribuida.entities.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioDAO usuarioDAO;
	
	
	
	@Override
	@Transactional
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return usuarioDAO.findAll();
	}

	@Override
	@Transactional
	public Usuario findOne(int id) {
		// TODO Auto-generated method stub
		return usuarioDAO.findOne(id);
	}

	@Override
	public void add(Usuario usuarios) {
		// TODO Auto-generated method stub
		usuarioDAO.add(usuarios);
	}


	@Override
	public void up(Usuario usuario) {
		// TODO Auto-generated method stub
		usuarioDAO.add(usuario);
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		usuarioDAO.del(id);
	}

	@Override
	public List<Usuario> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return usuarioDAO.findAll(busqueda);
	}

	@Override
	@Transactional
	public void add(String cedula, String nombre1, String nombre2, String apellido1, String apellido2,
			Date fechaNacimiento,int edad, String sexo, String direccion, String telefono, String correo, String tipo) {
		// TODO Auto-generated method stub
		Usuario usuario = new Usuario(cedula,nombre1,nombre2,apellido1,apellido2,fechaNacimiento,edad,sexo,direccion,telefono,correo,tipo);
		usuarioDAO.add(usuario);
	}

	@Override
	@Transactional
	public void up(int idUsuario, String cedula, String nombre1, String nombre2, String apellido1, String apellido2,
			Date fechaNacimiento, int edad, String sexo, String direccion, String telefono, String correo, String tipo) {
		// TODO Auto-generated method stub
		Usuario usuario = new Usuario(idUsuario,cedula,nombre1,nombre2,apellido1,apellido2,fechaNacimiento,edad,sexo,direccion,telefono,correo,tipo);
		usuarioDAO.add(usuario);
	}

	
	

}
