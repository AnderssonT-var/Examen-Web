package com.distribuida.service;

import java.util.Date;
import java.util.List;

import com.distribuida.entities.Usuario;

public interface UsuarioService {
	
	
	public List<Usuario> findAll();
	
	public Usuario findOne(int id);
	
<<<<<<< HEAD
	public void add(Usuario usuarios);
=======
	public void add(Usuario usuairos);
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	
	public void up(Usuario usuario);
	
	public void del(int id);
	
<<<<<<< HEAD
	public Usuario findOne(Usuario usuarios);
	
=======
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	
	public List<Usuario> findAll(String busqueda);
	public void add(String cedula, String nombre1, String nombre2, String apellido1, String apellido2, Date fechanacimiento,
			int edad,String sexo, String direccion, String telefono, String correo, String tipo);
<<<<<<< HEAD
	
=======
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	public void up(int idUsuario, String cedula, String nombre1, String nombre2, String apellido1, String apellido2,
	Date fechaNacimiento,int edad, String sexo, String direccion, String telefono, String correo, String tipo);
	
}
