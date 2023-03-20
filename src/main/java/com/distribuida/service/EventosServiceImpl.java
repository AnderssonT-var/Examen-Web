package com.distribuida.service;

import java.util.Date;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.distribuida.dao.CiudadesDAO;
import com.distribuida.dao.EventosDAO;
import com.distribuida.entities.Ciudades;
import com.distribuida.entities.Eventos;
import com.distribuida.entities.EventosDetalles;
import com.distribuida.entities.Usuario;



@Service
public class EventosServiceImpl implements EventosService {

	@Autowired
	private EventosDAO eventosDAO;
	
	@Autowired
	private CiudadesDAO ciudadesDAO;
	/*@Autowired
	private CiudadesDAO ciudadesDAO;*/
	
	@Override
	public List<Eventos> findAll() {
		// TODO Auto-generated method stub
		
		return eventosDAO.findAll();
	}

	@Override
	public Eventos findOne(int id) {
		// TODO Auto-generated method stub
		return eventosDAO.findOne(id);
	}

	@Override
	public void add(Eventos eventos) {
		// TODO Auto-generated method stub
		eventosDAO.add(eventos);
	}

	@Override
	public void up(Eventos eventos) {
		// TODO Auto-generated method stub
		eventosDAO.up(eventos);
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		eventosDAO.del(id);
	}

/*	@Override
	@Transactional
	public void add(String nombre, Date fechaInicio, Date fechaFin, String asunto, String lugar, byte[] imagen, String imagenNombre,double promedioCalificacion) {
		// TODO Auto-generated method stub
        Eventos eventos = new Eventos(nombre,fechaInicio,fechaFin,asunto,lugar,imagen,imagenNombre,promedioCalificacion);
		
	   Ciudades ciudades = ciudadesDAO.findOne(id_ciudad);
		
		eventos.setCiudades(ciudades);
		
		eventosDAO.add(eventos);
	}*/
	@Override
	public List<Eventos> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return eventosDAO.findAll(busqueda);
	}
	@Override
	public void up(int id, String nombre, Date fechaInicio, Date fechaFin, String asunto, String lugar, byte[] imagen, String imagenNombre,Double promedioCalificacion,int id_ciudad) {
		// TODO Auto-generated method stub
         Eventos eventos = new Eventos(id,nombre,fechaInicio,fechaFin,asunto,lugar,imagen,imagenNombre,promedioCalificacion);
		
		Ciudades ciudades = ciudadesDAO.findOne(id_ciudad);
		
		eventos.setCiudades(ciudades);
		
		eventosDAO.up(eventos);
	}

	

	@Override
	public void add(String nombre, Date fechaInicio, Date fechaFin, String asunto, String lugar, byte[] imagen,
			String imagenNombre, double promedioCalificacion,int id_ciudad) {
		// TODO Auto-generated method stub
        Eventos eventos = new Eventos(nombre,fechaInicio,fechaFin,asunto,lugar,imagen,imagenNombre,promedioCalificacion);
       Ciudades ciudades = ciudadesDAO.findOne(id_ciudad);
		
		eventos.setCiudades(ciudades);
		eventosDAO.up(eventos);

		
	}

	@Override

	public void add(double calificacion, int id_evento) {
		
		// TODO Auto-generated method stub
		Eventos eventos= eventosDAO.findOne(id_evento);
        eventos.setPromedioCalificacion(calificacion);
		
		eventosDAO.add(eventos);
		
	}

	

}
