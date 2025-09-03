package com.unir.products.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.unir.products.data.model.Articulo;

public interface ArticulosRepository extends JpaRepository<Articulo, Integer> 
{
	
	 List<Articulo> findBynombreArticuloContainingIgnoreCase(String articulo);	
	
}
