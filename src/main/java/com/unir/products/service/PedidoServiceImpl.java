package com.unir.products.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.unir.products.data.PedidoRepository;
import com.unir.products.data.model.Pedido;

@Service
public class PedidoServiceImpl 
{

	private final PedidoRepository PedidoRepository;
	
	
	 public PedidoServiceImpl(PedidoRepository PedidoRepository) //constructor
    {
	 
	 this.PedidoRepository=PedidoRepository;
	 
    }
	 
	 
	 public List<Pedido> getAllPedido()
    {
    	 return PedidoRepository.findAll(); //version con mysql
    }

  
    public Pedido addPPedido(Pedido pedido)
    {
    	return PedidoRepository.save(pedido);
    }
	
	
	
}
