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
		List<Usuario> usuarios= session.createQuery("select us from Usuario us", Usuario.class).getResultList();
		return usuarios;
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
		Query query = session.createQuery(
			"Select US "
				+" from Usuarios US"
				+" where US.cedula LIKE : keyBusqueda "
				+" or US.nombre1 LIKE : keyBusqueda "
				+" or US.nombre2 LIKE : keyBusqueda "
				+" or US.apellido1 LIKE : keyBusqueda "
				+" or US.apellido2 LIKE : keyBusqueda "
				+" or US.fechanacimiento LIKE : keyBusqueda "
				+" or US.edad LIKE : keyBusqueda "
				+" or US.sexo LIKE : keyBusqueda "
				+" or US.direccion LIKE : keyBusqueda "
				+" or US.telefono LIKE : keyBusqueda "
				+" or US.correo LIKE : keyBusqueda "
				+" or US.tipo LIKE : keyBusqueda "
				, Usuario.class);
				
		query.setParameter("keybusqueda","%" +busqueda+"%");	
		return query.getResultList();
	}

	
	
}
