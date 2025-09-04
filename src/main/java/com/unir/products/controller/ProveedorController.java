package com.unir.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.unir.products.data.model.Proveedor;
import com.unir.products.service.ProveedorServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin(
    origins = {
        "https://proyecto-unir-fahyf3qgn-carloshhd208s-projects.vercel.app",
        "http://localhost:3000"
    },
    allowCredentials = "true"
)


public class ProveedorController 
{
		@Autowired // sin esta cosa no jala (es para inyeecion de codigo)
	   private ProveedorServiceImpl service;
	
/////////////////////////// REST API PARA LOS Proveedores
		@GetMapping("/back2")  // Traer un Articulo especifico
		public String index()
		{
		return "BACKEND PROVEEDOR ACTIVO:"; //esto no funcion con el Responseentity
		}
		
		@GetMapping("/proveedor") //traer una lista de proveedor
	    public List<Proveedor> getAllProveedor()
	    {
	    	 return service.getAllProveedor();
	    }
	
		@PostMapping("/proveedor") // Agregar un proveedor
	    public Proveedor addProveedor(@RequestBody Proveedor proveedor)
	    {
	    	 return service.addProveedor(proveedor);
	    }
	
}
