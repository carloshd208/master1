package com.unir.products.data.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="pedido")

public class Pedido {
	
	public Long getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(Long id_pedido) {
		this.id_pedido = id_pedido;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY) //esto le dice a java que el autoincrementable lo va a gestionar el motor mysql
	 private Long id_pedido;
	 
	 @Column(name="usuario",length=45)
	private String usuario;
	 
	 @Column(name="direccion", length=45)
	 private String direccion;
	 
	 @Column(name="email", length=45)
	 private String email;
	 
	 @Column(name="cantidad", length=45)
	 private String cantidad;
	 
	 @Column(name="descripcion", length=45)
	 private String descripcion;
	
	

}
