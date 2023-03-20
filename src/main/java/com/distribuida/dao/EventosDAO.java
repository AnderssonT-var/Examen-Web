package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Eventos;



public interface EventosDAO {

	
	public List<Eventos> findAll();
	
	public Eventos findOne(int id);
	
	public void add(Eventos evento);
	
	public void up(Eventos evento);
	
	public void del(int id);
	
	public List<Eventos> findAll(String busqueda);

}
