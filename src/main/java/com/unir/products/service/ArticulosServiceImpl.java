package com.unir.products.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.unir.products.data.ArticulosRepository;
import com.unir.products.data.model.Articulo;
@Service
public class ArticulosServiceImpl implements ArticulosService {
	
	
	private final ArticulosRepository  articulosRepository;

    public ArticulosServiceImpl(ArticulosRepository articulosRepository) //constructor
    {   	
    	this.articulosRepository=articulosRepository;
    }
    
   /////////////////////////// REST API PARA LOS ARTICULOS

    @Override
	public Articulo getArticulo(Integer id_articulo)
    {
    	 return articulosRepository.findById(id_articulo).orElse(null);
    }
    
    @Override
	public List<Articulo> getAllArticulos()
    {
    	
    	 return articulosRepository.findAll(); 
    }

    @Override
	public Articulo removArticulo(Integer id)
    {	
    	Articulo articulo = articulosRepository.findById(id).orElse(null);
    	 if (articulosRepository.existsById(id)) 
    	 {
    	  articulosRepository.deleteById(id); 
    	 }
    	 
    	 return articulo;   	 
    }
    

    @Override
	public Articulo addArticulo(Articulo articulo)
    {
    	return articulosRepository.save(articulo);
    }
    
    
   
    @Override
	public Articulo updateArticulo(Integer id, Articulo updateArticulo)
    {
    	     	     	    	
    	if (articulosRepository.existsById(id))
    	{
    		Articulo articuloExistente = articulosRepository.findById(id).orElse(null);
    		
    		
    	
    		
    		articulosRepository.save(articuloExistente);
    	}
    	
    	return updateArticulo;
    }
      
   
    @Override
	public List<Articulo> searcArticulos( String tipoarticulo)
    {   	
    	
    	if (tipoarticulo == null || tipoarticulo.trim().isEmpty()) {
            return articulosRepository.findAll(); // 
        }
        
    	return articulosRepository.findBynombreArticuloContainingIgnoreCase(tipoarticulo);   	  	
    }
	
	
}
