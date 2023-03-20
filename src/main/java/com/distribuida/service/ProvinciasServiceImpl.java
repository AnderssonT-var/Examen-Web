package com.distribuida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.distribuida.dao.ProvinciasDAO;
import com.distribuida.dao.RegionesDAO;
import com.distribuida.entities.Provincias;
import com.distribuida.entities.Regiones;
import com.distribuida.entities.Provincias;

@Service
public class ProvinciasServiceImpl implements ProvinciasService {


	@Autowired
	private ProvinciasDAO provinciasDAO;
	
	@Autowired
	private RegionesDAO regionesDAO;
	@Override
	public List<Provincias> findAll() {
		// TODO Auto-generated method stub
		return provinciasDAO.findAll();
	}

	@Override
	public Provincias findOne(int id) {
		// TODO Auto-generated method stub
		return provinciasDAO.findOne(id);
	}

	@Override
	@Transactional
	public void add(Provincias provincias) {
		// TODO Auto-generated method stub
		provinciasDAO.add(provincias);

	}

	@Override	
	public void up(Provincias provincias) {
		// TODO Auto-generated method stub
		provinciasDAO.up(provincias);

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		provinciasDAO.del(id);

	}

	@Override
	public List<Provincias> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return provinciasDAO.findAll(busqueda);
	}

	@Override
	@Transactional
	public void add(String provincia, int id_region) {
		// TODO Auto-generated method stub
		 Provincias provincias = new Provincias(provincia);
			
		 Regiones regiones = regionesDAO.findOne(id_region);
			
			provincias.setRegiones(regiones);
			
			provinciasDAO.add(provincias);
	}
	@Override
	public void up(int id, String provincia, int id_region) {
		// TODO Auto-generated method stub
		 Provincias provincias = new Provincias(id,provincia);
		 Regiones regiones = regionesDAO.findOne(id_region);

			provinciasDAO.up(provincias);
		
	}

/*	@Override
	public void add(Provincias provincias) {
		// TODO Auto-generated method stub
		
	}*/

	/*@Override
	public void add(String provincia) {
		// TODO Auto-generated method stub
		 Provincias provincias = new Provincias(provincia);
		 provincias.setRegiones(null);;
			provinciasDAO.add(provincias);

	}*/

	
}
