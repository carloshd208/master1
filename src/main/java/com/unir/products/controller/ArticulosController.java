package com.unir.products.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.unir.products.data.model.Articulo;
import com.unir.products.service.ArticulosServiceImpl;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


//

@RestController
@RequiredArgsConstructor
@Slf4j
@CrossOrigin(
    originPatterns = {
        "https://*.vercel.app", 
        "http://localhost:3000"
    },
    allowCredentials = "true"
)

@Tag(name = "Products Controller", description = "Microservicio encargado de exponer operaciones CRUD sobre productos alojados en una base de datos en memoria.")
public class ArticulosController 
{
	 
    //////////////////////////// VARIABLES DE APOYO
    ///
	@Autowired //  (es para inyeecion de codigo)
   private ArticulosServiceImpl service;
   
    
    
   /////////////////////////// REST API PARA LOS ARTICULOS
	@GetMapping("/")  // Traer un Articulo especifico
    public String index()
    {
		return "BACKEND ACTIVO:"; //
		 
    }
    
    @GetMapping("articulo/{id}")  // Traer un Articulo especifico
    public Articulo getArticulo(@PathVariable Integer id)
    {
    	
    	return service.getArticulo(id);
    }
    
    
    @GetMapping("/articulo") //traer una lista de Articulos
    public List<Articulo> getAllArticulos()
    {
    	
    	 return service.getAllArticulos();
    }
    
    
    @DeleteMapping("/articulo/{id}")  // Eliminar Articulo especifico
    public Articulo removArticulo(@PathVariable Integer id)
    {
    	return service.removArticulo(id);
    }
    
    
    @PostMapping("/articulo") // Agregar Articulo
    public Articulo addArticulo(@RequestBody Articulo articulo)
    {
    	 return service.addArticulo(articulo);
    }
    
    
    @PutMapping("/articulo/{id}") // Modificar Articulo
    public Articulo updateArticulo(@PathVariable Integer id,@RequestBody Articulo updateArticulo)
    {
    	  return service.updateArticulo(id,updateArticulo);
    }
    
    
    @GetMapping("articulo/search")  // Buscar un Articulo especifico
    public List<Articulo> searcArticulos(@RequestParam(name="articulo",required=false) String tipoarticulo)
    {
    	return service.searcArticulos(tipoarticulo);
    
    }
    
}   
    
    
    
    


