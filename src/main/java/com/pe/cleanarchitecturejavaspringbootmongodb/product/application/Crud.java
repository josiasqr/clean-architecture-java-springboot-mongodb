package com.pe.cleanarchitecturejavaspringbootmongodb.product.application;

import com.pe.cleanarchitecturejavaspringbootmongodb.product.domain.model.Product;

public interface Crud<T> {
  Iterable<T> listAll();
  Product getById(String _id);
  Product create(T t);
}
