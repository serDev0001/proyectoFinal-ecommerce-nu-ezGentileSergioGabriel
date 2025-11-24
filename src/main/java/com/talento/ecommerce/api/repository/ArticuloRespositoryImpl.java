package com.talento.ecommerce.api.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.talento.ecommerce.api.model.Articulo;

public class ArticuloRespositoryImpl implements ArticuloRepository {

    private final List<Articulo> articulos = new ArrayList<>();
    private long idCounter = 1;

    //los metodos CRUD implementados 
    @Override
    public List<Articulo> findAll() {
        return new ArrayList<>(articulos);  
    }

    @Override
    public Optional<Articulo> findById(Long id) {
        return articulos.stream()
                .filter(articulo -> articulo.getId().equals(id))
                .findFirst();
    }

    @Override
    public Articulo save(Articulo articulo) {
        if (articulo.getId() == null) {
            articulo.setId(idCounter++);
            articulos.add(articulo);
        } else {
            deleteById(articulo.getId());
            articulos.add(articulo);
        }
        return articulo;
    }

    @Override
    public void deleteById(Long id) {
        articulos.removeIf(articulo -> articulo.getId().equals(id));
    }   

}
