package com.distribuida.service;

import java.util.List;

import com.distribuida.entities.Regiones;

public interface RegionesService {




	public static List<Regiones> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Regiones findOne(int id);
	
	public void add(Regiones regiones);
	
	public void up(Regiones regiones);
	
	public void del(int id);
	
	public List<Regiones> findAll(String busqueda);

public void add(String region);
	
	public void up(int id,String region);
	
	
}
