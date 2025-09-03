package com.unir.products.data.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "articulos")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Articulo {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_articulo") // Es buena práctica mapear explícitamente
    private Long idArticulo; // Usar camelCase para campos Java
    
    @Column(name = "articulo", length = 45, nullable = false)
    private String nombreArticulo; // Mejor nombre para evitar confusión
    
    @Column(name = "cantidad", length = 45)
    private String cantidad;
    
    // GETTERS Y SETTERS OBLIGATORIOS
    public Long getIdArticulo() {
        return idArticulo;
    }
    
    public void setIdArticulo(Long idArticulo) {
        this.idArticulo = idArticulo;
    }
    
    public String getNombreArticulo() {
        return nombreArticulo;
    }
    
    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }
    
    public String getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}