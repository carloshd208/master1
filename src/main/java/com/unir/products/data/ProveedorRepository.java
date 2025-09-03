package com.unir.products.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unir.products.data.model.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> 
{
	List<Proveedor> findByProveedorContainingIgnoreCase(String proveedor);	
}
