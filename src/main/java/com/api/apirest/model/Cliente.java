package com.api.apirest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name="clientes")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String apellido;
	private Integer codigo_razon_social;
	private Integer codigo_estado;
	private Integer codigo_tipo_cliente;
	
	
	
	
	public Cliente() {}
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	



	public Integer getCodigo_razon_social() {
		return codigo_razon_social;
	}



	public void setCodigo_razon_social(Integer codigo_razon_social) {
		this.codigo_razon_social = codigo_razon_social;
	}



	public Integer getCodigo_estado() {
		return codigo_estado;
	}



	public void setCodigo_estado(Integer codigo_estado) {
		this.codigo_estado = codigo_estado;
	}



	public Integer getCodigo_tipo_cliente() {
		return codigo_tipo_cliente;
	}



	public void setCodigo_tipo_cliente(Integer codigo_tipo_cliente) {
		this.codigo_tipo_cliente = codigo_tipo_cliente;
	}



	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", codigo_razon_social="
				+ codigo_razon_social + ", codigo_estado=" + codigo_estado + ", codigo_tipo_cliente="
				+ codigo_tipo_cliente + "]";
	}


	
	
	
	
}
