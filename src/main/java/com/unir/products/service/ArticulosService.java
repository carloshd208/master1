package com.unir.products.service;

import java.util.List;

import com.unir.products.data.model.Articulo;

public interface ArticulosService 
{ 
	 	 Articulo getArticulo(Integer id_articulo);
	     List<Articulo> getAllArticulos();
	     Articulo removArticulo(Integer id);
	     Articulo addArticulo(Articulo articulo);
	     Articulo updateArticulo(Integer id, Articulo updateArticulo);
	     List<Articulo> searcArticulos( String tipoarticulo);
}
