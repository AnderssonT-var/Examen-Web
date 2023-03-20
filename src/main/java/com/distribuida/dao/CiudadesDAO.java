package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Ciudades;

public interface CiudadesDAO {


	public List<Ciudades> findAll();
	
	public Ciudades findOne(int id);
	
	public void add(Ciudades ciudades);
	
	public void up(Ciudades ciudades);
	
	public void del(int id);
	
	public List<Ciudades> findAll(String busqueda);
	
}
