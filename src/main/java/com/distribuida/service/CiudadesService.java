package com.distribuida.service;

import java.util.Date;
import java.util.List;

import com.distribuida.entities.Ciudades;

public interface CiudadesService {
	
	

    

    public static List<Ciudades> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	public Ciudades findOne(int id);
	
//	public void add(Ciudades ciudades);
	
	public void up(Ciudades ciudades);
	
	public void del(int id);
	


	public static List<Ciudades> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return null;
	}	
	
   public void add(String ciudad,int id_provincia);
	
	public void up(int id,String ciudad/*, int id_provincia*/);
	
	
}
