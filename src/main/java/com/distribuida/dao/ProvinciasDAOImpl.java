package com.distribuida.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.distribuida.entities.Provincias;

@Repository
public class ProvinciasDAOImpl implements ProvinciasDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Provincias> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();		
		return session.createQuery("from Provincias", Provincias.class).getResultList();
	}

	@Override
	@Transactional
	public Provincias findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Provincias.class, id);	}

	@Override
	@Transactional
	public void add(Provincias provincias) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(provincias);
	}

	@Override
	@Transactional
	public void up(Provincias provincias) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(provincias);
		
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
	public List<Provincias> findAll(String busqueda) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();

		   Query<Provincias> query= session.createQuery(
	       		
	       		"select pr "
	       		+ " from Provincias pr "
	       		+ " where pr.provincia LIKE: Busqueda "
	       				

	    		,Provincias.class);
	       query.setParameter("Busqueda","%"+busqueda+"%");
			return query.getResultList();	}

	
	
}
