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
@Table(name = "Eventos_Detalles")
public class EventosDetalles {


	//id	descripcion	calificacion	id_usuario	id_evento
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "calificacion")
	private double calificacion;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE})
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE})
	@JoinColumn(name = "id_evento")
	private Eventos evento;
	

	public EventosDetalles( ) { }
			

	
		

	public EventosDetalles(int id, String descripcion, double calificacion) {
		this.id = id;
		this.descripcion = descripcion;
		this.calificacion = calificacion;
	}
	
	


	public EventosDetalles(String descripcion, double calificacion) {
		this.descripcion = descripcion;
		this.calificacion = calificacion;
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getDescripcion() {
		return descripcion;
	}





	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}





	public double getCalificacion() {
		return calificacion;
	}





	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}





	public Usuario getUsuario() {
		return usuario;
	}




	@Autowired
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}





	public Eventos getEvento() {
		return evento;
	}




	@Autowired
	public void setEvento(Eventos evento) {
		this.evento = evento;
	}





	@Override
	public String toString() {
		return "EventosDetalles [id=" + id + ", descripcion=" + descripcion + ", calificacion=" + calificacion
				+ ", usuario=" + usuario + ", evento=" + evento + "]";
	}
	
}
