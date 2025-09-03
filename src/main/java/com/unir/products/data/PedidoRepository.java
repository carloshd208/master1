package com.unir.products.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unir.products.data.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> 
{
	List<Pedido> findByusuarioContainingIgnoreCase(String usuario);	
	
}
