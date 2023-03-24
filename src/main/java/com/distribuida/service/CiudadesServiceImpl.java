package com.distribuida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.distribuida.dao.CiudadesDAO;
import com.distribuida.dao.EventosDAO;
import com.distribuida.dao.ProvinciasDAO;
import com.distribuida.entities.Ciudades;
import com.distribuida.entities.Eventos;
import com.distribuida.entities.Provincias;
import com.distribuida.entities.Regiones;
import com.distribuida.entities.Usuario;

@Service
public class CiudadesServiceImpl implements CiudadesService {

	

	@Autowired
	private CiudadesDAO ciudadesDAO;
	
	@Autowired
	private ProvinciasDAO provinciasDAO;
	@Override
	@Transactional
	public List<Ciudades> findAll() {
		// TODO Auto-generated method stub
		return ciudadesDAO.findAll();
	}

	@Override
	@Transactional
	public Ciudades findOne(int id) {
		// TODO Auto-generated method stub
		return ciudadesDAO.findOne(id);
	}

	/*@Override
	@Transactional
	public void add(Ciudades ciudades) {
		// TODO Auto-generated method stub
		//Ciudades ciudades = new Ciudades(ciudades);
		
		ciudadesDAO.add(ciudades);
	}*/

	@Override
	@Transactional
	public void up(Ciudades ciudades) {
		// TODO Auto-generated method stub
		ciudadesDAO.up(ciudades);

	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		ciudadesDAO.del(id);

	}

	@Override
	@Transactional
	public List<Ciudades> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return ciudadesDAO.findAll(busqueda);
	}

	@Override
	@Transactional
	public void add(String ciudad,int id_provincia) {
		// TODO Auto-generated method stub
		 Ciudades ciudades = new Ciudades(ciudad);
		 Provincias provincias = provinciasDAO.findOne(id_provincia);
		 ciudades.setProvincias(provincias);
		
			ciudadesDAO.add(ciudades);
	}

	@Override
	@Transactional
	public void up(int id, String ciudad/*, int id_provincia*/) {
		// TODO Auto-generated method stub
		Ciudades ciudades = new Ciudades(id,ciudad);
		/* Provincias provincias = provinciasDAO.findOne(id_provincia);		*/		
			ciudadesDAO.up(ciudades);
		
	}

	

	
	

	
	
	
}
