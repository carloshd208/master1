package com.unir.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.unir.products.data.model.Pedido;
import com.unir.products.service.PedidoServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin(
    origins = {
        "https://*-carloshhd208s-projects.vercel.app", 
        "http://localhost:3000"
    },
    allowCredentials = "true"
)

public class PedidoController 
{
	@Autowired // sin esta cosa no jala (es para inyeecion de codigo)
	private PedidoServiceImpl service;
	
	
	/////////////////////////// REST API PARA LOS Pedidos
	@GetMapping("/back3")  // Traer un Pedido especifico
	public String index()
	{
	return "BACKEND PROVEEDOR ACTIVO:"; //esto no funcion con el Responseentity
	}
	
	@GetMapping("/pedido") //traer una lista de Pedido
	public List<Pedido> getAllPedido()
	{
	return service.getAllPedido();
	}
	
	@PostMapping("/pedido") // Agregar un Pedido
	public Pedido addProveedor(@RequestBody Pedido pedido)
	{
	return service.addPPedido(pedido);
	}
	
}
