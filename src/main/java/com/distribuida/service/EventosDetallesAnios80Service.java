package com.distribuida.service;

import java.util.List;

import com.distribuida.entities.EventosDetallesAnios80;

public interface EventosDetallesAnios80Service {

		//CRUD BASICO: (CREATE, READ, UPDATE, DELETE)
	
		public List<EventosDetallesAnios80> findAll(); 
			
			public EventosDetallesAnios80 findOne(int id);
			
			//public void add(EventosDetallesAnios80 eventosDetallesAnios80);
			
			//public void up(EventosDetallesAnios80 eventosDetallesAnios80);
			public void add(int color1, int color2, int color3, int color4, int color5, int color6, int color7, int color8, int color9, int color10, int juego1, int juego2, int juego3, int juego4, int juego5, int juego6, int juego7, int juego8, int juego9, int juego10);
			
			public void add(int idEventosDetalle, int color1, int color2, int color3, int color4, int color5, int color6, int color7, int color8, int color9, int color10, int juego1, int juego2, int juego3, int juego4, int juego5, int juego6, int juego7, int juego8, int juego9, int juego10, Double probColor, Double probJuego, Double probTotal);
			
			
			public void up(int id, int idEventosDetalle, int color1, int color2, int color3, int color4, int color5, int color6, int color7, int color8, int color9, int color10, int juego1, int juego2, int juego3, int juego4, int juego5, int juego6, int juego7, int juego8, int juego9, int juego10, Double probColor, Double probJuego, Double probTotal);
			
			public void del(int id);

			
			//CONSULTAS PERSONALIZADAS
			
			public EventosDetallesAnios80 findOne(EventosDetallesAnios80 eventosDetallesAnios80);
			
			public List<EventosDetallesAnios80> findAll(String busqueda);

			public void add(EventosDetallesAnios80 eventosDetallesAnios80);
	
}
