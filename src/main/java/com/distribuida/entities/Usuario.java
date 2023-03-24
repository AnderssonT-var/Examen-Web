package com.distribuida.entities;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Component;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Component
@Entity
@Table(name="Usuarios")
public class Usuario{
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int idUsuario;
	@Column(name="cedula")
	private String cedula;
	@Column(name="nombre1")
	private String nombre1;
	@Column(name="nombre2")
	private String nombre2;
	@Column(name="apellido1")
	private String apellido1;
	@Column(name="apellido2")
	private String apellido2;
<<<<<<< HEAD
	@DateTimeFormat(pattern = "yyyy-MM-dd")
=======
	@DateTimeFormat(iso=ISO.DATE)
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	@Column(name="fecha_nacimiento")
	private Date fechaNacimiento;
	@Column(name="edad")
	private int edad;
	@Column(name="sexo")
	private String sexo;
	@Column(name="direccion")
	private String direccion;
	@Column(name="telefono")
	private String telefono;
	@Column(name="correo")
	private String correo;
	@Column(name="tipo")
	private String tipo;

  
<<<<<<< HEAD
	public Usuario() {}
		
	public Usuario(Usuario usuario) {
		
	}


	public Usuario(String cedula, String nombre1, String nombre2, String apellido1, String apellido2, Date fechaNacimiento,
=======
public Usuario() {}
		


public Usuario(String cedula, String nombre1, String nombre2, String apellido1, String apellido2, Date fechaNacimiento,
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
		int edad,String sexo, String direccion, String telefono, String correo, String tipo) {
	
	this.cedula = cedula;
	this.nombre1 = nombre1;
	this.nombre2 = nombre2;
	this.apellido1 = apellido1;
	this.apellido2 = apellido2;
	this.fechaNacimiento = fechaNacimiento;
	this.edad = edad;
	this.sexo = sexo;
	this.direccion = direccion;
	this.telefono = telefono;
	this.correo = correo;
	this.tipo = tipo;
}

<<<<<<< HEAD
	public Usuario(int idUsuario, String cedula, String nombre1, String nombre2, String apellido1, String apellido2,
=======
public Usuario(int idUsuario, String cedula, String nombre1, String nombre2, String apellido1, String apellido2,
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
		Date fechaNacimiento, int edad,String sexo, String direccion, String telefono, String correo, String tipo) {
	super();
	this.idUsuario = idUsuario;
	this.cedula = cedula;
	this.nombre1 = nombre1;
	this.nombre2 = nombre2;
	this.apellido1 = apellido1;
	this.apellido2 = apellido2;
	this.fechaNacimiento = fechaNacimiento;
	this.edad = edad;
	this.sexo = sexo;
	this.direccion = direccion;
	this.telefono = telefono;
	this.correo = correo;
	this.tipo = tipo;
}



<<<<<<< HEAD
	public int getIdUsuario() {
=======
public int getIdUsuario() {
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	return idUsuario;
}



<<<<<<< HEAD
	public void setIdUsuario(int idUsuario) {
=======
public void setIdUsuario(int idUsuario) {
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	this.idUsuario = idUsuario;
}



<<<<<<< HEAD
	public String getCedula() {
=======
public String getCedula() {
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	return cedula;
}



<<<<<<< HEAD
	public void setCedula(String cedula) {
=======
public void setCedula(String cedula) {
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	this.cedula = cedula;
}



<<<<<<< HEAD
	public String getNombre1() {
=======
public String getNombre1() {
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	return nombre1;
}



<<<<<<< HEAD
	public void setNombre1(String nombre1) {
=======
public void setNombre1(String nombre1) {
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	this.nombre1 = nombre1;
}



<<<<<<< HEAD
	public String getNombre2() {
=======
public String getNombre2() {
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	return nombre2;
}



<<<<<<< HEAD
	public void setNombre2(String nombre2) {
=======
public void setNombre2(String nombre2) {
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	this.nombre2 = nombre2;
}



<<<<<<< HEAD
	public String getApellido1() {
=======
public String getApellido1() {
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	return apellido1;
}



<<<<<<< HEAD
	public void setApellido1(String apellido1) {
=======
public void setApellido1(String apellido1) {
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	this.apellido1 = apellido1;
}



<<<<<<< HEAD
	public String getApellido2() {
=======
public String getApellido2() {
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	return apellido2;
}



<<<<<<< HEAD
	public void setApellido2(String apellido2) {
=======
public void setApellido2(String apellido2) {
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	this.apellido2 = apellido2;
}



<<<<<<< HEAD
	public Date getFechaNacimiento() {
=======
public Date getFechaNacimiento() {
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	return fechaNacimiento;
}



<<<<<<< HEAD
	public void setFechaNacimiento(Date fechaNacimiento) {
=======
public void setFechaNacimiento(Date fechaNacimiento) {
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	this.fechaNacimiento = fechaNacimiento;
}


<<<<<<< HEAD
	public int getEdad() {
=======
public int getEdad() {
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	return edad;
}



<<<<<<< HEAD
	public void setEdad(int edad) {
	this.edad = edad;
}

	public String getSexo() {
=======
public void setEdad(int edad) {
	this.edad = edad;
}

public String getSexo() {
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	return sexo;
}



<<<<<<< HEAD
	public void setSexo(String sexo) {
=======
public void setSexo(String sexo) {
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	this.sexo = sexo;
}



<<<<<<< HEAD
	public String getDireccion() {
=======
public String getDireccion() {
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	return direccion;
}



<<<<<<< HEAD
	public void setDireccion(String direccion) {
=======
public void setDireccion(String direccion) {
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	this.direccion = direccion;
}



<<<<<<< HEAD
	public String getTelefono() {
=======
public String getTelefono() {
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	return telefono;
}



<<<<<<< HEAD
	public void setTelefono(String telefono) {
=======
public void setTelefono(String telefono) {
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	this.telefono = telefono;
}



<<<<<<< HEAD
	public String getCorreo() {
=======
public String getCorreo() {
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	return correo;
}



<<<<<<< HEAD
	public void setCorreo(String correo) {
=======
public void setCorreo(String correo) {
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	this.correo = correo;
}



<<<<<<< HEAD
	public String getTipo() {
=======
public String getTipo() {
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	return tipo;
}



<<<<<<< HEAD
	public void setTipo(String tipo) {
=======
public void setTipo(String tipo) {
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	this.tipo = tipo;
}



<<<<<<< HEAD
	@Override
	public String toString() {
=======
@Override
public String toString() {
>>>>>>> 23f67a3ed18ccd1bb3d6a0943ce5d38fcee5733b
	return "Usuario [idUsuario=" + idUsuario + ", cedula=" + cedula + ", nombre1=" + nombre1 + ", nombre2=" + nombre2
			+ ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", fechaNacimiento=" + fechaNacimiento
			+ ", edad=" + edad + ", sexo=" + sexo + ", direccion=" + direccion + ", telefono=" + telefono + ", correo="
			+ correo + ", tipo=" + tipo + "]";
}










}
