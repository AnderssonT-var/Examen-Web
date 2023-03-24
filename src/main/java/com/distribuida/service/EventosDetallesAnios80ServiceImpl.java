package com.distribuida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.distribuida.dao.EventosDetallesAnios80DAO;
import com.distribuida.dao.EventosDetallesDAO;
import com.distribuida.entities.EventosDetalles;
import com.distribuida.entities.EventosDetallesAnios80;

@Service
public class EventosDetallesAnios80ServiceImpl implements EventosDetallesAnios80Service {

	@Autowired
	private EventosDetallesAnios80DAO eventosDetallesAnios80DAO;
	
	@Autowired
	private EventosDetallesDAO eventosDetallesDAO;
	
	@Override
	public List<EventosDetallesAnios80> findAll() {
		// TODO Auto-generated method stub
		return eventosDetallesAnios80DAO.findAll();
	}

	@Override
	public EventosDetallesAnios80 findOne(int id) {
		// TODO Auto-generated method stub
		return eventosDetallesAnios80DAO.findOne(id);
	}

	@Override
	public void add(int idEventosDetalle, int color1, int color2, int color3, int color4, int color5, int color6,
			int color7, int color8, int color9, int color10, int juego1, int juego2, int juego3, int juego4, int juego5,
			int juego6, int juego7, int juego8, int juego9, int juego10, Double probColor, Double probJuego,
			Double probTotal) {
		// TODO Auto-generated method stub
		EventosDetalles eventosDetalles = eventosDetallesDAO.findOne(idEventosDetalle);
		EventosDetallesAnios80 evd80 = new EventosDetallesAnios80(eventosDetalles);
		evd80.setColor1(color1);
		evd80.setColor2(color2);
		evd80.setColor3(color3);
		evd80.setColor4(color4);
		evd80.setColor5(color5);
		evd80.setColor6(color6);
		evd80.setColor7(color7);
		evd80.setColor8(color8);
		evd80.setColor9(color9);
		evd80.setColor10(color10);
		evd80.setJuego1(juego1);
		evd80.setJuego2(juego2);
		evd80.setJuego3(juego3);
		evd80.setJuego4(juego4);
		evd80.setJuego5(juego5);
		evd80.setJuego6(juego6);
		evd80.setJuego7(juego7);
		evd80.setJuego8(juego8);
		evd80.setJuego9(juego9);
		evd80.setJuego10(juego10);
		evd80.setProbColor(probColor);
		evd80.setProbJuego(probJuego);
		evd80.setProbTotal(probTotal);
		eventosDetallesAnios80DAO.add(evd80);

	}

	@Override
	public void up(int id, int idEventosDetalle, int color1, int color2, int color3, int color4, int color5, int color6,
			int color7, int color8, int color9, int color10, int juego1, int juego2, int juego3, int juego4, int juego5,
			int juego6, int juego7, int juego8, int juego9, int juego10, Double probColor, Double probJuego,
			Double probTotal) {
		// TODO Auto-generated method stub
		EventosDetalles eventosDeatlles = eventosDetallesDAO.findOne(idEventosDetalle);
		EventosDetallesAnios80 evd80 = eventosDetallesAnios80DAO.findOne(id);
		
		evd80.setEventosDetalles(eventosDeatlles);
		evd80.setColor1(color1);
		evd80.setColor2(color2);
		evd80.setColor3(color3);
		evd80.setColor4(color4);
		evd80.setColor5(color5);
		evd80.setColor6(color6);
		evd80.setColor7(color7);
		evd80.setColor8(color8);
		evd80.setColor9(color9);
		evd80.setColor10(color10);
		evd80.setJuego1(juego1);
		evd80.setJuego2(juego2);
		evd80.setJuego3(juego3);
		evd80.setJuego4(juego4);
		evd80.setJuego5(juego5);
		evd80.setJuego6(juego6);
		evd80.setJuego7(juego7);
		evd80.setJuego8(juego8);
		evd80.setJuego9(juego9);
		evd80.setJuego10(juego10);
		evd80.setProbColor(probColor);
		evd80.setProbJuego(probJuego);
		evd80.setProbTotal(probTotal);
		
		eventosDetallesAnios80DAO.add(evd80);
		
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		eventosDetallesAnios80DAO.del(id);
	}

	@Override
	public List<EventosDetallesAnios80> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return eventosDetallesAnios80DAO.findAll(busqueda);
	}

	@Override
	public EventosDetallesAnios80 findOne(EventosDetallesAnios80 eventosDetallesAnios80) {
		// TODO Auto-generated method stub
		
		return eventosDetallesAnios80DAO.findOne(eventosDetallesAnios80);
	}

	@Override
	public void add(int color1, int color2, int color3, int color4, int color5, int color6, int color7, int color8,
			int color9, int color10, int juego1, int juego2, int juego3, int juego4, int juego5, int juego6, int juego7,
			int juego8, int juego9, int juego10) {
		// TODO Auto-generated method stub

		EventosDetallesAnios80 evd80 = new EventosDetallesAnios80();
		evd80.setColor1(color1);
		evd80.setColor2(color2);
		evd80.setColor3(color3);
		evd80.setColor4(color4);
		evd80.setColor5(color5);
		evd80.setColor6(color6);
		evd80.setColor7(color7);
		evd80.setColor8(color8);
		evd80.setColor9(color9);
		evd80.setColor10(color10);
		evd80.setJuego1(juego1);
		evd80.setJuego2(juego2);
		evd80.setJuego3(juego3);
		evd80.setJuego4(juego4);
		evd80.setJuego5(juego5);
		evd80.setJuego6(juego6);
		evd80.setJuego7(juego7);
		evd80.setJuego8(juego8);
		evd80.setJuego9(juego9);
		evd80.setJuego10(juego10);
		eventosDetallesAnios80DAO.add(evd80);
	}

	@Override
	public void add(EventosDetallesAnios80 eventosDetallesAnios80) {
		// TODO Auto-generated method stub
		eventosDetallesAnios80DAO.add(eventosDetallesAnios80);
	}

}
