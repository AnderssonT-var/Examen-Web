package com.distribuida.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.distribuida.entities.EventosDetalles;
import com.distribuida.entities.EventosDetallesAnios80;

@Repository
public class EventosDetallesAnios80DAOImpl implements EventosDetallesAnios80DAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<EventosDetallesAnios80> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<EventosDetallesAnios80> eventosDetallesAnios80 = session.createQuery("from EventosDetallesAnios80", EventosDetallesAnios80.class).getResultList();
		return eventosDetallesAnios80;
	}

	@Override
	@Transactional
	public EventosDetallesAnios80 findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(EventosDetallesAnios80.class, id);
	}

	@Override
	@Transactional
	public void add(EventosDetallesAnios80 eventosDetallesAnios80) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(eventosDetallesAnios80);
	}

	@Override	
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		EventosDetallesAnios80 eventosDetallesAnios80 = session.get(EventosDetallesAnios80.class, id);
		session.delete(eventosDetallesAnios80);
	}

	@Override
	@Transactional
	public List<EventosDetallesAnios80> findAll(String busqueda) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query<EventosDetallesAnios80> query = session.createQuery(
				"select evd80"
				+" from EventosDetallesAnios80 evd80"
				+" where evd80.color1 LIKE : busqueda"
				+" or evd80.color2 LIKE : busqueda"
				+" or evd80.color3 LIKE : busqueda"
				+" or evd80.color4 LIKE : busqueda"
				+" or evd80.color5 LIKE : busqueda"
				+" or evd80.color6 LIKE : busqueda"
				+" or evd80.color7 LIKE : busqueda"
				+" or evd80.color8 LIKE : busqueda"
				+" or evd80.color9 LIKE : busqueda"
				+" or evd80.color10 LIKE : busqueda"
				+" or evd80.juego1 LIKE : busqueda"
				+" or evd80.juego2 LIKE : busqueda"
				+" or evd80.juego3 LIKE : busqueda"
				+" or evd80.juego4 LIKE : busqueda"
				+" or evd80.juego5 LIKE : busqueda"
				+" or evd80.juego6 LIKE : busqueda"
				+" or evd80.juego7 LIKE : busqueda"
				+" or evd80.juego8 LIKE : busqueda"
				+" or evd80.juego9 LIKE : busqueda"
				+" or evd80.probColor LIKE : busqueda"
				+" or evd80.probJuego LIKE : busqueda"
				+" or evd80.probTotal LIKE : busqueda"
				, EventosDetallesAnios80.class);
		query.setParameter("busqueda", "%"+busqueda+"%");
		return query.getResultList();
	}

	@Override
	public EventosDetallesAnios80 findOne(EventosDetallesAnios80 eventosDetallesAnios80) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		
		Query<EventosDetallesAnios80> query = session.createQuery("select evd80 "
				+ " from EventosDetallesAnios80 evd80 "
				+ " where 1=1 "
				+ " and evd.eventosDetalles = : eventosDetalles "				
			, EventosDetallesAnios80.class);
		

		query.setParameter("eventosDetalles", eventosDetallesAnios80.getEventosDetalles());
		
		
		return query.getSingleResult();
	}

}
