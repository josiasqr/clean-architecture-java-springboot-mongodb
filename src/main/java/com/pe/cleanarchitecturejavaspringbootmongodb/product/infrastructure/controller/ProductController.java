package com.pe.cleanarchitecturejavaspringbootmongodb.product.infrastructure.controller;

import com.pe.cleanarchitecturejavaspringbootmongodb.product.application.service.ProductService;
import com.pe.cleanarchitecturejavaspringbootmongodb.product.domain.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
  private final ProductService productService;
  
  public ProductController(ProductService productService) {
    this.productService = productService;
  }
  
  @GetMapping
  public ResponseEntity<Iterable<Product>> listAll() {
    return ResponseEntity.ok().body(this.productService.listAll());
  }
  
  @GetMapping("/{_id}")
  public ResponseEntity<Product> getById(@PathVariable String _id) {
    return ResponseEntity.ok().body(this.productService.getById(_id));
  }
  
  @PostMapping
  public ResponseEntity<Product> create(@RequestBody Product product) {
    return ResponseEntity.status(HttpStatus.CREATED).body(productService.create(product));
  }
}
