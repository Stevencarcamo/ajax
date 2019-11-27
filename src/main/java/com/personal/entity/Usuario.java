package com.personal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//tabla
@Entity
@Table(name="usuarios")
public class Usuario {
	
	//campos de la tabla
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_usuario;
	private String nombre;
	private String direccion;
	private Integer telefono;
	
	//constructor sin parametros
	public Usuario() {

	}

	//constructor con parametros
	public Usuario(Integer id_usuario, String nombre, String direccion, Integer telefono) {
		super();
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;  
	}
	
	//metodos get y set

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombre() { 
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
}
