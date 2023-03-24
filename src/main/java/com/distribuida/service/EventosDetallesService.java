package com.distribuida.service;

import java.util.Date;
import java.util.List;

import com.distribuida.entities.EventosDetalles;


public interface EventosDetallesService {

	
	public List<EventosDetalles> findAll();
	
	public EventosDetalles findOne(int id);
	
	public void add(EventosDetalles EventosDetalles);
	
	public void up(EventosDetalles EventosDetalles);
	
	public void del(int id);
	
	public void add(String descripcion, int calificacion, int id_evento, int id_usuario);
	
	public void up(int id, String descripcion, int calificacion, int id_evento, int id_usuario);

	public EventosDetalles findOne(EventosDetalles eventosDetalles);

	List<EventosDetalles> findAll(String busqueda);
	
}
