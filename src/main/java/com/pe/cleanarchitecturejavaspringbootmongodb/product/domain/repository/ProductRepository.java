package com.pe.cleanarchitecturejavaspringbootmongodb.product.domain.repository;

import com.pe.cleanarchitecturejavaspringbootmongodb.product.domain.model.Product;


public interface ProductRepository {
  Iterable<Product> listAll();
  Product getById(String _id);
  Product create(Product product);
}
