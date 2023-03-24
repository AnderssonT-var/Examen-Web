package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.EventosDetalles;



public interface EventosDetallesDAO {
	
<<<<<<< HEAD
	public List<EventosDetalles> findAll();
=======
public List<EventosDetalles> findAll();
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	
	public EventosDetalles findOne(int id);
	
	public void add(EventosDetalles eventosDetalles);
	
	public void up(EventosDetalles eventosDetalles);
	
	public void del(int id);
	
<<<<<<< HEAD
	public List<EventosDetalles> findAll(String busqueda);

	EventosDetalles findOne(EventosDetalles eventosDetalles);
	
	public void promedioCalificacion();
=======
	public List<EventosDetalles> findAll(int idEvento);

	EventosDetalles findOne(EventosDetalles eventosDetalles);
	
	//public void promedioCalificacion();

	public List<EventosDetalles>findAll(String busqueda);
	//List<EventosDetalles> findAll1(String nombre);

	public List<EventosDetalles> findAll1(int idUsuario);

	//List<EventosDetalles> findAll1(String nombre);
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	
}
