package com.pe.cleanarchitecturejavaspringbootmongodb.product.infrastructure.adapter;

import com.pe.cleanarchitecturejavaspringbootmongodb.product.infrastructure.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepositoryMongo extends CrudRepository<ProductEntity, String> {
}
