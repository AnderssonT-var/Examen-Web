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
@Table(name="Provincias")
public class Provincias {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	

	@Column(name="provincia")
	private String provincia;
	

	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE})
	@JoinColumn(name="id_region")
	private  Regiones regiones;
	
	
	public Provincias() {}


	public Provincias(int id, String provincia) {
		this.id = id;
		this.provincia = provincia;
	}


	public Provincias(String provincia) {
		this.provincia = provincia;
		}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public Regiones getRegiones() {
		return regiones;
	}

	@Autowired
	public void setRegiones(Regiones regiones) {
		this.regiones = regiones;
	}


	@Override
	public String toString() {
		return "Provincias [id=" + id + ", provincia=" + provincia + ", regiones=" + regiones + "]";
	}
	
	

}
