package com.pe.cleanarchitecturejavaspringbootmongodb.product.infrastructure.config;

import com.pe.cleanarchitecturejavaspringbootmongodb.product.application.service.InProductService;
import com.pe.cleanarchitecturejavaspringbootmongodb.product.application.service.ProductService;
import com.pe.cleanarchitecturejavaspringbootmongodb.product.domain.repository.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
  @Bean
  ProductService productBeanService(final ProductRepository productRepository) {
    return new InProductService(productRepository);
  }
}
