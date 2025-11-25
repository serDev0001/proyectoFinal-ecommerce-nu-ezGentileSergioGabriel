package com.talento.ecommerce.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.talento.ecommerce.api.model.Articulo;

@Repository 
public interface ArticuloRepository extends JpaRepository<Articulo, Long> {
    
}
