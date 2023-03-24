package com.distribuida.dao;

import java.util.List;


import com.distribuida.entities.EventosDetallesAnios80;


public interface EventosDetallesAnios80DAO {
	
	//CRUD BASICO: (CREATE, READ, UPDATE, DELETE)
	
		public List<EventosDetallesAnios80> findAll(); 
				
		public EventosDetallesAnios80 findOne(int id);
				
		public void add(EventosDetallesAnios80 eventosDetallesAnios80);
				
		//public void up(EventosDetallesAnios80 eventosDetallesAnios80);
				
		public void del(int id);

				
		//CONSULTAS PERSONALIZADAS
		
		EventosDetallesAnios80 findOne(EventosDetallesAnios80 eventosDetallesAnios80);
				
		public List<EventosDetallesAnios80> findAll(String busqueda);	

}
