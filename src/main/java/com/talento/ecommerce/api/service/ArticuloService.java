package com.talento.ecommerce.api.service;

import java.util.List;
import java.util.Optional;

import com.talento.ecommerce.api.model.Articulo;

public interface ArticuloService {
    List<Articulo> listarArticulos();
    Optional<Articulo> obtenerArticuloPorId(Long id);
    Articulo guardarArticulo(Articulo articulo);
    Articulo actualizarArticulo(Long id, Articulo articulo);
    void eliminarArticulo(Long id);
    
}
