package com.distribuida.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.distribuida.entities.Regiones;

@Repository
public class RegionesDAOImpl implements RegionesDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Regiones> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();		
		return session.createQuery("from Regiones", Regiones.class).getResultList();
	}

	@Override
	@Transactional
	public Regiones findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Regiones.class, id);	}

	@Override
	@Transactional
	public void add(Regiones regiones) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(regiones);
	}

	@Override
	@Transactional
	public void up(Regiones regiones) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(regiones);
		
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
	public List<Regiones> findAll(String busqueda) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();

		   Query<Regiones> query= session.createQuery(
	       		
	       		"select re "
	       		+ " from Regiones re "
	       		+ " where re.region LIKE: Busqueda "
	       				

	    		,Regiones.class);
	       query.setParameter("Busqueda","%"+busqueda+"%");
			return query.getResultList();	}

	
}
