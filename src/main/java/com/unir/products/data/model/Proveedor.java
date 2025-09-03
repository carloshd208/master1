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
@Table(name="proveedor")

public class Proveedor {

	@Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY) //esto le dice a java que el autoincrementable lo va a gestionar el motor mysql
	 private Long id_proveedor;
	 
	 public Long getId_proveedor() {
		return id_proveedor;
	}

	public void setId_proveedor(Long id_proveedor) {
		this.id_proveedor = id_proveedor;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
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

	@Column(name="proveedor",length=45)
	private String proveedor;
	 
	 @Column(name="direccion", length=45)
	 private String direccion;
	 
	 @Column(name="email", length=45)
	 private String email;
	
}
