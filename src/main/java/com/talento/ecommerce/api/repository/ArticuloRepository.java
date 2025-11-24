package com.talento.ecommerce.api.repository;

import java.util.List;
import java.util.Optional;

import com.talento.ecommerce.api.model.Articulo;

public interface ArticuloRepository {
    List<Articulo> findAll();
    Optional<Articulo> findById(Long id);
    Articulo save(Articulo articulo);
    void deleteById(Long id);
    
}
