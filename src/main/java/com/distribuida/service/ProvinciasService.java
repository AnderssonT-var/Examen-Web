package com.distribuida.service;

import java.util.List;

import com.distribuida.entities.Provincias;

public interface ProvinciasService {

	
public List<Provincias> findAll();
	
	public Provincias findOne(int id);
		
	public void up(Provincias provincias);
	public void add(Provincias provincias);

	
	public void del(int id);
	
	public List<Provincias> findAll(String busqueda);
	
   public void add(String provincia,int id_region);
	
	public void up(int id,String provincia, int id_region);


	
	
}
