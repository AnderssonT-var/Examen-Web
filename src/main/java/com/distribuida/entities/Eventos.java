package com.distribuida.entities;

import java.util.Arrays;
import java.util.Date;

import javax.annotation.Generated;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
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
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="Eventos")
public class Eventos {
	//id	nombre	fecha	asunto	lugar	imagen	imagen_nombre
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		
		@Column(name="nombre")
		private String nombre;
		
		@DateTimeFormat(iso=ISO.DATE)	
		@Column(name="fecha_inicio")
		private Date fechaInicio;
		
		@DateTimeFormat(iso=ISO.DATE)
		@Column(name="fecha_fin")
		private Date fechaFin;
		
		@Column(name="asunto")
		private String asunto;
		
		@Column(name="lugar")
		private String lugar;
		
		@Column(name="imagen")
		private byte[] imagen;
		
		@Column(name="imagen_nombre")
		private String imagenNombre;

		@Column(name="promedio_calificacion")
		private Double promedioCalificacion;
		

		

		@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE})
		@JoinColumn(name="id_ciudad")
		private  Ciudades ciudades;
	

		public Eventos(){};


		public Eventos(int id, String nombre, Date fechaInicio, Date fechaFin, String asunto, String lugar,
				byte[] imagen, String imagenNombre, Double promedioCalificacion) {
			this.id = id;
			this.nombre = nombre;
			this.fechaInicio = fechaInicio;
			this.fechaFin = fechaFin;
			this.asunto = asunto;
			this.lugar = lugar;
			this.imagen = imagen;
			this.imagenNombre = imagenNombre;
			this.promedioCalificacion = promedioCalificacion;
		}





		public Eventos(String nombre, Date fechaInicio, Date fechaFin, String asunto, String lugar, byte[] imagen,
				String imagenNombre, Double promedioCalificacion) {
			this.nombre = nombre;
			this.fechaInicio = fechaInicio;
			this.fechaFin = fechaFin;
			this.asunto = asunto;
			this.lugar = lugar;
			this.imagen = imagen;
			this.imagenNombre = imagenNombre;
			this.promedioCalificacion = promedioCalificacion;
		}





		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public Date getFechaInicio() {
			return fechaInicio;
		}


		public void setFechaInicio(Date fechaInicio) {
			this.fechaInicio = fechaInicio;
		}


		public Date getFechaFin() {
			return fechaFin;
		}


		public void setFechaFin(Date fechaFin) {
			this.fechaFin = fechaFin;
		}


		public String getAsunto() {
			return asunto;
		}


		public void setAsunto(String asunto) {
			this.asunto = asunto;
		}


		public String getLugar() {
			return lugar;
		}


		public void setLugar(String lugar) {
			this.lugar = lugar;
		}


		public byte[] getImagen() {
			return imagen;
		}


		public void setImagen(byte[] imagen) {
			this.imagen = imagen;
		}


		public String getImagenNombre() {
			return imagenNombre;
		}


		public void setImagenNombre(String imagenNombre) {
			this.imagenNombre = imagenNombre;
		}

		
		public Double getPromedioCalificacion() {
			return promedioCalificacion;
		}


		public void setPromedioCalificacion(Double promedioCalificacion) {
			this.promedioCalificacion = promedioCalificacion;
		}



		public Ciudades getCiudad() {
			return ciudades;
		}

		@Autowired
		public void setCiudades(Ciudades ciudad) {
			this.ciudades = ciudad;
		}


		@Override
		public String toString() {
			return "Eventos [id=" + id + ", nombre=" + nombre + ", fechaInicio=" + fechaInicio + ", fechaFin="
					+ fechaFin + ", asunto=" + asunto + ", lugar=" + lugar + ", imagen=" + Arrays.toString(imagen)
					+ ", imagenNombre=" + imagenNombre + ", promedioCalificacion=" + promedioCalificacion
					+ ", ciudades=" + ciudades + "]";
		}

         
		
	
}


