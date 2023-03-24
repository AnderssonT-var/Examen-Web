package com.distribuida.service;

import java.util.List;

import com.distribuida.entities.Provincias;

public interface ProvinciasService {

	
<<<<<<< HEAD
public List<Provincias> findAll();
=======
public static List<Provincias> findAll() {
	// TODO Auto-generated method stub
	return null;
}
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	
	public Provincias findOne(int id);
		
	public void up(Provincias provincias);
	public void add(Provincias provincias);

	
	public void del(int id);
	
	public List<Provincias> findAll(String busqueda);
	
   public void add(String provincia,int id_region);
	
	public void up(int id,String provincia, int id_region);


	
	
}
