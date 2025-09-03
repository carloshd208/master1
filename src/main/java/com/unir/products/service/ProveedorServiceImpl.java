package com.unir.products.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.unir.products.data.ProveedorRepository;
import com.unir.products.data.model.Proveedor;
@Service
public class ProveedorServiceImpl 
{

	
	private final ProveedorRepository ProveedorRepository;
	
	
	 public ProveedorServiceImpl(ProveedorRepository ProveedorRepository) //constructor
	    {
		 
		 this.ProveedorRepository=ProveedorRepository;
		 
	    }
	 
	 
		public List<Proveedor> getAllProveedor()
	    {
	    	 return ProveedorRepository.findAll(); //version con mysql
	    }

	  
	    public Proveedor addProveedor(Proveedor proveedor)
	    {
	    	return ProveedorRepository.save(proveedor);
	    }
	    
	
}
