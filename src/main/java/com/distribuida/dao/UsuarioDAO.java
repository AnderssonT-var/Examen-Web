package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Usuario;


	public interface UsuarioDAO{
		
	public List<Usuario> findAll();
	public Usuario findOne(int id);
	public void add(Usuario usuario);
	public void up(Usuario usuario);
	public void del(int id);
<<<<<<< HEAD
	public Usuario findOne(Usuario usuario);
=======

>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	public List<Usuario> findAll(String busqueda);
	}

