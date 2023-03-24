package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Eventos;



public interface EventosDAO {

<<<<<<< HEAD
	
=======

>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	public List<Eventos> findAll();
	
	public Eventos findOne(int id);
	
	public void add(Eventos evento);
	
	public void up(Eventos evento);
	
	public void del(int id);
	
	public List<Eventos> findAll(String busqueda);

<<<<<<< HEAD
=======

>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
}
