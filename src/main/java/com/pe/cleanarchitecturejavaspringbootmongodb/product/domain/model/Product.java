package com.pe.cleanarchitecturejavaspringbootmongodb.product.domain.model;

import lombok.Data;

@Data
public class Product {
  private String name;
  private String description;
  private Double price;
}
