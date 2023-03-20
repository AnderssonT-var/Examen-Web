package com.distribuida.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "Logins")
public class Logins {
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@DateTimeFormat(iso=ISO.TIME)
	@Column(name = "fecha_ingreso")
	private Date fechaIngreso;
	
	@DateTimeFormat(iso=ISO.TIME)
	@Column(name = "fecha_salida")
	private Date fechaSalida;
	
	@Column(name = "tiempo")
	private double tiempo;
	
	@Column(name = "usuario")
	private String usuario;
	
	@Column(name = "clave")
	private String clave;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="id_usuario")
	private Usuario usuario1;
	
	
	public Logins() { }
	
	@Autowired
	public Logins(Usuario usuario) {
		this.usuario1 = usuario;
	}


	public Logins(int id, Date fechaIngreso, Date fechaSalida, double tiempo, String usuario, String clave) {	
		this.id = id;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
		this.tiempo = tiempo;
		this.usuario = usuario;
		this.clave = clave;
	}


	public Logins(Date fechaIngreso, Date fechaSalida, double tiempo, String usuario, String clave) {		
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
		this.tiempo = tiempo;
		this.usuario = usuario;
		this.clave = clave;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date getFechaIngreso() {
		return fechaIngreso;
	}


	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}


	public Date getFechaSalida() {
		return fechaSalida;
	}


	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}


	public double getTiempo() {
		return tiempo;
	}


	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}
		

	public Usuario getUsuario1() {
		return usuario1;
	}

	public void setUsuario1(Usuario usuario1) {
		this.usuario1 = usuario1;
	}

	
	
	@Override
	public String toString() {
		return "Logins [id=" + id + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida + ", tiempo="
				+ tiempo + ", usuario=" + usuario + ", clave=" + clave + ", usuario1=" + usuario1 + "]";
	}
	
	
	

}
