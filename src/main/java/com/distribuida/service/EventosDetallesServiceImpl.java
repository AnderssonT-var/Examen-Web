package com.distribuida.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.distribuida.dao.EventosDAO;
import com.distribuida.dao.EventosDetallesDAO;
import com.distribuida.dao.UsuarioDAO;
import com.distribuida.entities.Ciudades;
import com.distribuida.entities.Eventos;
import com.distribuida.entities.EventosDetalles;
import com.distribuida.entities.Usuario;



@Service
public class EventosDetallesServiceImpl implements EventosDetallesService {

	
	
	@Autowired
	private EventosDetallesDAO eventosDetallesDAO;
	
	@Autowired
	private UsuarioDAO usuariosDAO;
	
	@Autowired
	private EventosDAO eventosDAO;
	
	
	
	
	@Override
	public List<EventosDetalles> findAll() {
		// TODO Auto-generated method stub
		return eventosDetallesDAO.findAll();
	}

	@Override
	public EventosDetalles findOne(int id) {
		// TODO Auto-generated method stub
		return eventosDetallesDAO.findOne(id);
	}

	@Override
	public void add(EventosDetalles EventosDetalles) {
		// TODO Auto-generated method stub
		eventosDetallesDAO.add(EventosDetalles);
	}

	@Override
	public void up(EventosDetalles EventosDetalles) {
		// TODO Auto-generated method stub
		eventosDetallesDAO.up(EventosDetalles);
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		eventosDetallesDAO.del(id);
	}

	@Override
	@Transactional
	public List<EventosDetalles> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return eventosDetallesDAO.findAll(busqueda);
	}


	@Override
	public void add(String descripcion, int calificacion, int id_evento, int id_usuario) {
		// TODO Auto-generated method stub
		EventosDetalles eventosDetalles = new EventosDetalles(descripcion, calificacion);
		
		Eventos evento = eventosDAO.findOne(id_evento);
		Usuario usuario = usuariosDAO.findOne(id_usuario);
		
		eventosDetalles.setEvento(evento);
		eventosDetalles.setUsuario(usuario);
		
		eventosDetallesDAO.add(eventosDetalles);
		
		
		
	}

	@Override
	public void up(int id, String descripcion, int calificacion, int id_evento, int id_usuario) {
		// TODO Auto-generated method stub
		
		EventosDetalles eventosDetalles = new EventosDetalles(id, descripcion, calificacion);
		
		Eventos evento = eventosDAO.findOne(id_evento);
		Usuario usuario = usuariosDAO.findOne(id_usuario);
		
		eventosDetalles.setEvento(evento);
		eventosDetalles.setUsuario(usuario);
		
		eventosDetallesDAO.up(eventosDetalles);
		
	}

	@Override
	public EventosDetalles findOne(EventosDetalles eventosDetalles) {
		// TODO Auto-generated method stub
		return eventosDetallesDAO.findOne(eventosDetalles);
	}

	

}
