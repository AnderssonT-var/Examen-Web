package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Provincias;

public interface ProvinciasDAO {

	

	public List<Provincias> findAll();
	
	public Provincias findOne(int id);
	
	public void add(Provincias provincias);
	
	public void up(Provincias provincias);
	
	public void del(int id);
	
	public List<Provincias> findAll(String busqueda);
	
}
