package com.distribuida.service;

import java.util.Date;
import java.util.List;

import com.distribuida.entities.Usuario;

public interface UsuarioService {
	
	
	public List<Usuario> findAll();
	
	public Usuario findOne(int id);
	
	public void add(Usuario usuairos);
	
	public void up(Usuario usuario);
	
	public void del(int id);
	
	
	public List<Usuario> findAll(String busqueda);
	public void add(String cedula, String nombre1, String nombre2, String apellido1, String apellido2, Date fechanacimiento,
			int edad,String sexo, String direccion, String telefono, String correo, String tipo);
	public void up(int idUsuario, String cedula, String nombre1, String nombre2, String apellido1, String apellido2,
	Date fechaNacimiento,int edad, String sexo, String direccion, String telefono, String correo, String tipo);
	
}
