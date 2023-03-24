package com.distribuida.dao;

import java.util.List;

import org.hibernate.Session;

import com.distribuida.entities.Ciudades;
import com.distribuida.entities.Eventos;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class CiudadesDAOImpl implements CiudadesDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Ciudades> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();		
		return session.createQuery("from Ciudades", Ciudades.class).getResultList();
	}

	@Override
	@Transactional
	public Ciudades findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Ciudades.class, id);	}

	@Override
	@Transactional
	public void add(Ciudades ciudades) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(ciudades);
	}

	@Override
	@Transactional
	public void up(Ciudades ciudades) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(ciudades);
		
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
	public List<Ciudades> findAll(String busqueda) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();

		   Query<Ciudades> query= session.createQuery(
	       		
	       		"select ci "
	       		+ " from Ciudades ci "
	       		+ " where ci.ciudad LIKE: Busqueda "
	       				

	    		,Ciudades.class);
	       query.setParameter("Busqueda","%"+busqueda+"%");
			return query.getResultList();	}

	
	
}
