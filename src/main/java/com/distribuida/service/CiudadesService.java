package com.distribuida.service;

import java.util.Date;
import java.util.List;

import com.distribuida.entities.Ciudades;

public interface CiudadesService {
	
	
    public List<Ciudades> findAll();
	
	public Ciudades findOne(int id);
	
//	public void add(Ciudades ciudades);
	
	public void up(Ciudades ciudades);
	
	public void del(int id);
	
	public List<Ciudades> findAll(String busqueda);
	
	
   public void add(String ciudad,int id_provincia);
	
	public void up(int id,String ciudad/*, int id_provincia*/);
	
	
}
