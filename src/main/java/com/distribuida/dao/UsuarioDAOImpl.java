package com.distribuida.dao;

import java.util.List;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.distribuida.entities.Usuario;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO{


	@Autowired
	private SessionFactory sessionFactory; 
	
	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		return  session.createQuery("select us from Usuario us", Usuario.class).getResultList();
	}

	@Override
	@Transactional
	public Usuario findOne(int id) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		Query query= session.createQuery("select us from Usuario us where idUsuario = : keyID",Usuario.class);
		return session.get(Usuario.class, id);
	}

	@Override
	@Transactional
	public void add(Usuario usuario) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		session.saveOrUpdate(usuario);	
	}

	@Override
	@Transactional
	public void up(Usuario usuario) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(usuario);
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		
		Usuario usuario = session.get(Usuario.class,id);
		
		session.delete(usuario);
	}


	@Override
	@Transactional
	public List<Usuario> findAll(String busqueda) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		Query <Usuario> query = session.createQuery(
			" Select us "
				+" from Usuario us "
				+" where us.nombre1 LIKE : busqueda "
				+" or us.nombre2 LIKE : busqueda "
				+" or us.apellido1 LIKE : busqueda "
				+" or us.apellido2 LIKE : busqueda "
				+" or us.sexo LIKE : busqueda "
				+" or us.direccion LIKE : busqueda "
				+" or us.telefono LIKE : busqueda "
				+" or us.correo LIKE : busqueda "
				+" or us.tipo LIKE : busqueda "
				, Usuario.class);
				
		query.setParameter("busqueda","%" +busqueda+"%");	
		return query.getResultList();
	}
	
}
