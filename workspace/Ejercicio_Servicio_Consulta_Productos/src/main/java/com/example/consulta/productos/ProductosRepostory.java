package com.example.consulta.productos;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductosRepostory extends MongoRepository<ProductoDto, Long> {

}
