package com.distribuida.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.distribuida.entities.Logins;
import com.distribuida.entities.Usuario;

@Repository
public class LoginsDAOImpl implements LoginsDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	@Override
	@Transactional
	public List<Logins> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();		
		return session.createQuery(" from Logins ",Logins.class).getResultList();
	}

	@Override
	@Transactional
	public Logins findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Logins.class, id);
	}

	@Override
	@Transactional
	public void add(Logins login) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(login);
	}

	@Override
	@Transactional
	public void up(Logins login) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(login);
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
	public Logins validar(String usuario, String clave) {
		Session session= sessionFactory.getCurrentSession();
		Query query = session.createQuery(
			"Select US "
				+" from Logins US"
				+" where US.usuario = : usuario and US.clave = : clave "
	
				, Logins.class);
				
		query.setParameter("usuario", usuario);
		query.setParameter("clave", clave);
		System.out.print(query.getSingleResult());
		return (Logins)query.getSingleResult();

	}

}
