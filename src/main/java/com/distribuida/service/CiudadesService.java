package com.distribuida.service;

import java.util.Date;
import java.util.List;

import com.distribuida.entities.Ciudades;

public interface CiudadesService {
	
	
<<<<<<< HEAD
    public List<Ciudades> findAll();
=======
    public static List<Ciudades> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	
	public Ciudades findOne(int id);
	
//	public void add(Ciudades ciudades);
	
	public void up(Ciudades ciudades);
	
	public void del(int id);
	
<<<<<<< HEAD
	public List<Ciudades> findAll(String busqueda);
=======
	public static List<Ciudades> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return null;
	}
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	
	
   public void add(String ciudad,int id_provincia);
	
	public void up(int id,String ciudad/*, int id_provincia*/);
	
	
}
