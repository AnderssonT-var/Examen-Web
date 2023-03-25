package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Usuario;


	public interface UsuarioDAO{
		
	public List<Usuario> findAll();
	public Usuario findOne(int id);
	public void add(Usuario usuario);
	public void up(Usuario usuario);
	public void del(int id);

	public List<Usuario> findAll(String busqueda);
	}

