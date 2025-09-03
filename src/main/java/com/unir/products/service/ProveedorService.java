package com.unir.products.service;

import java.util.List;

import com.unir.products.data.model.Proveedor;

public interface ProveedorService {

	
	Proveedor getProveedor(Integer id_proveedor);
    List<Proveedor> getAllProveedor();
    Proveedor removProveedor(Integer id);
    Proveedor addProveedor(Proveedor proveedor);
    Proveedor updateProveedor(Integer id, Proveedor updateproveedor);
    List<Proveedor> searchProveedor( String tipoproveedor);
	
	
}
