package com.distribuida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.distribuida.dao.RegionesDAO;
import com.distribuida.dao.ProvinciasDAO;
import com.distribuida.dao.RegionesDAO;
import com.distribuida.entities.Regiones;
import com.distribuida.entities.Usuario;
import com.distribuida.entities.Provincias;

@Service
public class RegionesServiceImpl implements RegionesService {

	


	
	
	@Autowired
	private RegionesDAO regionesDAO;
	@Override
	public List<Regiones> findAll() {
		// TODO Auto-generated method stub
		return regionesDAO.findAll();
	}

	@Override
	public Regiones findOne(int id) {
		// TODO Auto-generated method stub
		return regionesDAO.findOne(id);
	}

	@Override
	public void add(Regiones regiones) {
		// TODO Auto-generated method stub
		regionesDAO.add(regiones);

	}

	@Override
	public void up(Regiones regiones) {
		// TODO Auto-generated method stub
		regionesDAO.up(regiones);

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		regionesDAO.del(id);

	}

	@Override
	public List<Regiones> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return regionesDAO.findAll(busqueda);
	}

	@Override
	public void add(String region) {
		// TODO Auto-generated method stub
		 Regiones regiones = new Regiones(region);
			
		regionesDAO.add(regiones);
	}

	@Override
	public void up(int id, String region) {
		// TODO Auto-generated method stub
		 Regiones regiones = new Regiones(id,region);
			
			regionesDAO.up(regiones);
		
	}

	
}
