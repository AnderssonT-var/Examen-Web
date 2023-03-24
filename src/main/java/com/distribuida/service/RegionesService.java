package com.distribuida.service;

import java.util.List;

import com.distribuida.entities.Regiones;

public interface RegionesService {


<<<<<<< HEAD
	public List<Regiones> findAll();
=======
	public static List<Regiones> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	
	public Regiones findOne(int id);
	
	public void add(Regiones regiones);
	
	public void up(Regiones regiones);
	
	public void del(int id);
	
	public List<Regiones> findAll(String busqueda);

public void add(String region);
	
	public void up(int id,String region);
	
	
}
