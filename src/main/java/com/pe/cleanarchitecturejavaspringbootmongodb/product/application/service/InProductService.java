package com.pe.cleanarchitecturejavaspringbootmongodb.product.application.service;

import com.pe.cleanarchitecturejavaspringbootmongodb.product.domain.model.Product;
import com.pe.cleanarchitecturejavaspringbootmongodb.product.domain.repository.ProductRepository;

public class InProductService implements ProductService {
  private final ProductRepository productRepository;
  
  public InProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }
  
  @Override
  public Iterable<Product> listAll() {
    return this.productRepository.listAll();
  }
  
  @Override
  public Product getById(String _id) {
    return this.productRepository.getById(_id);
  }
  
  @Override
  public Product create(Product product) {
    return this.productRepository.create(product);
  }
}
