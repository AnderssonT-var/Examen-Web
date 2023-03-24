package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Regiones;

public interface RegionesDAO {


	public List<Regiones> findAll();
	
	public Regiones findOne(int id);
	
	public void add(Regiones regiones);
	
	public void up(Regiones regiones);
	
	public void del(int id);
	
	public List<Regiones> findAll(String busqueda);
	
}
