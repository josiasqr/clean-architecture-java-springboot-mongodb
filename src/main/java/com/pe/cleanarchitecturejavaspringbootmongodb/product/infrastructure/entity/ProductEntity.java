package com.pe.cleanarchitecturejavaspringbootmongodb.product.infrastructure.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "product")
public class ProductEntity {
  private String _id;
  private String name;
  private String description;
  private Double price;
}
