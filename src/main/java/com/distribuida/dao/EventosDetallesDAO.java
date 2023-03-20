package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.EventosDetalles;



public interface EventosDetallesDAO {
	
	public List<EventosDetalles> findAll();
	
	public EventosDetalles findOne(int id);
	
	public void add(EventosDetalles eventosDetalles);
	
	public void up(EventosDetalles eventosDetalles);
	
	public void del(int id);
	
	public List<EventosDetalles> findAll(String busqueda);

	EventosDetalles findOne(EventosDetalles eventosDetalles);
	
	public void promedioCalificacion();
	
}
