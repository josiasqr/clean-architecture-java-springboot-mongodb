package com.pe.cleanarchitecturejavaspringbootmongodb.product.infrastructure.adapter;

import com.pe.cleanarchitecturejavaspringbootmongodb.product.domain.model.Product;
import com.pe.cleanarchitecturejavaspringbootmongodb.product.domain.repository.ProductRepository;
import com.pe.cleanarchitecturejavaspringbootmongodb.product.infrastructure.entity.ProductEntity;
import com.pe.cleanarchitecturejavaspringbootmongodb.product.infrastructure.mapper.ProductMapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class DomainMongoRepositoryMongo implements ProductRepository {
  private final ProductRepositoryMongo productRepositoryMongo;
  private final ProductMapper productMapper;
  
  public DomainMongoRepositoryMongo(ProductRepositoryMongo productRepositoryMongo,
                                    ProductMapper productMapper) {
    this.productRepositoryMongo = productRepositoryMongo;
    this.productMapper = productMapper;
  }
  
  @Override
  public Iterable<Product> listAll() {
    return this.productMapper.toProducts(this.productRepositoryMongo.findAll());
  }
  
  @Override
  public Product getById(String _id) {
    Optional<ProductEntity> productEntity = productRepositoryMongo.findById(_id);
    
    return this.productMapper.toProduct(productEntity.orElse(null));
  }
  
  @Override
  public Product create(Product product) {
    ProductEntity productEntity = this.productMapper.toProductEntity(product);
    
    return productMapper.toProduct(this.productRepositoryMongo.save(productEntity));
  }
}
