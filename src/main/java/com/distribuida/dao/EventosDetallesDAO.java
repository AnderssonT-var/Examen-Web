package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.EventosDetalles;



public interface EventosDetallesDAO {
	
public List<EventosDetalles> findAll();
	
	public EventosDetalles findOne(int id);
	
	public void add(EventosDetalles eventosDetalles);
	
	public void up(EventosDetalles eventosDetalles);
	
	public void del(int id);
	
	public List<EventosDetalles> findAll(int idEvento);

	EventosDetalles findOne(EventosDetalles eventosDetalles);
	
	//public void promedioCalificacion();

	public List<EventosDetalles>findAll(String busqueda);
	//List<EventosDetalles> findAll1(String nombre);

	public List<EventosDetalles> findAll1(int idUsuario);

	//List<EventosDetalles> findAll1(String nombre);
	
}
