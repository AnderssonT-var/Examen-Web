package com.distribuida.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="Ciudades")
public class Ciudades {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	

	@Column(name="ciudad")
	private String ciudad;
	

	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE})
	@JoinColumn(name="id_provincia")
	private  Provincias provincias;
	
	public Ciudades () { }

	public Ciudades(int id, String ciudad) {
		this.id = id;
		this.ciudad = ciudad;
	}

	public Ciudades(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	
	public Provincias getProvincias() {
		return provincias;
	}
	@Autowired
	public void setProvincias(Provincias provincias) {
		this.provincias = provincias;
	}

	@Override
	public String toString() {
		return "Ciudades [id=" + id + ", ciudad=" + ciudad + ",provincias="+provincias+"]";
	}

	
	
}
