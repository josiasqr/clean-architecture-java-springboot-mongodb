package com.pe.cleanarchitecturejavaspringbootmongodb.product.infrastructure.mapper;

import com.pe.cleanarchitecturejavaspringbootmongodb.product.domain.model.Product;
import com.pe.cleanarchitecturejavaspringbootmongodb.product.infrastructure.entity.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
  @Mapping(target = "_id", ignore = true)
  ProductEntity toProductEntity(Product product);
  
  Product toProduct(ProductEntity productEntity);
  
  Iterable<Product> toProducts(Iterable<ProductEntity> productEntity);
}
