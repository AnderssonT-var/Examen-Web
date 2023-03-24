package com.distribuida.service;

import java.util.Date;
import java.util.List;

import com.distribuida.entities.EventosDetalles;


public interface EventosDetallesService {

	
<<<<<<< HEAD
	public List<EventosDetalles> findAll();
=======
public List<EventosDetalles> findAll();
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	
	public EventosDetalles findOne(int id);
	
	public void add(EventosDetalles EventosDetalles);
	
	public void up(EventosDetalles EventosDetalles);
	
	public void del(int id);
	
	public void add(String descripcion, int calificacion, int id_evento, int id_usuario);
	
	public void up(int id, String descripcion, int calificacion, int id_evento, int id_usuario);

	public EventosDetalles findOne(EventosDetalles eventosDetalles);

<<<<<<< HEAD
	List<EventosDetalles> findAll(String busqueda);
=======
	//List<EventosDetalles> findAll(String busqueda);
	
	List<EventosDetalles> findAll(int idEvento);

	List<EventosDetalles> findAll(String busqueda);

	List<EventosDetalles> findAll1(int idUsuario);



>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	
}
