package com.unir.products.service;

import java.util.List;

import com.unir.products.data.model.Pedido;

public interface PedidoService {

	Pedido getPedido(Integer id_Pedido);
    List<Pedido> getAllPedido();
    Pedido removPedido(Integer id);
    Pedido addPPedido(Pedido Pedido);
    Pedido updatePedido(Integer id, Pedido updatepPedido);
    List<Pedido> searchPedido( String tipoPedido);
	
	
}
