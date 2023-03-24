package com.distribuida.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.distribuida.entities.Eventos;
import com.distribuida.entities.EventosDetalles;



@Repository
public class EventosDetallesDAOImpl implements EventosDetallesDAO {
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
    private EventosDAO eventosDAO;
	
	
	@Override
	@Transactional
	public List<EventosDetalles> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();		
		return session.createQuery("from EventosDetalles", EventosDetalles.class).getResultList();
	}
	
	
	@Override
	@Transactional
	public EventosDetalles findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(EventosDetalles.class, id);
	}

	@Override
	@Transactional
	public void add(EventosDetalles eventosDetalles) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(eventosDetalles);
	}

	@Override
	@Transactional
	public void up(EventosDetalles eventosDetalles) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(eventosDetalles);
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));
	}


	@Override
	@Transactional
	public EventosDetalles findOne(EventosDetalles eventosDetalles) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		
		Query<EventosDetalles> query = session.createQuery("select evd "
				+ " from EventosDetalles evd "
				+ " where 1=1 "
//				+ " and evd.descripcion = : descripcion "
//				+ " and evd.calificacion = : calificacion "
				+ " and evd.evento = : evento "
				+ " and evd.usuario = : usuario "				
			, EventosDetalles.class);
		
//		query.setParameter("descripcion", eventosDetalles.getDescripcion());
//		query.setParameter("calificacion", eventosDetalles.getCalificacion());
		query.setParameter("evento", eventosDetalles.getEvento());
		query.setParameter("usuario", eventosDetalles.getUsuario());
		
		return query.getSingleResult();
	}

	@Override
	@Transactional
	public List<EventosDetalles>findAll(String busqueda) {
		
		Session session=sessionFactory.getCurrentSession();

		   Query<EventosDetalles> query= session.createQuery(
	       		
	       		"select evd "
	       		+ " from EventosDetalles evd "
	       		+ " where evd.descripcion LIKE: Busqueda "
	       		+" or evd.calificacion LIKE: Busqueda "
	       		

	    		,EventosDetalles.class);
	       query.setParameter("Busqueda","%"+busqueda+"%");
			return query.getResultList();
	}





	@Override
	@Transactional
	public void promedioCalificacion() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();

		Query query=session.createQuery( "select avg (calificacion) from EventosDetalles where id_evento  = 2 group by id_evento=2; ",EventosDetalles.class);

		 Eventos eventos=session.get(Eventos.class, 2);
		eventosDAO.add(eventos);
	}
	

}
