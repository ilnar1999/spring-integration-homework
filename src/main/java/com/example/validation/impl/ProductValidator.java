package com.example.validation.impl;

import static java.util.Objects.isNull;

import com.example.model.Product;
import com.example.validation.Validator;
import org.springframework.stereotype.Component;

@Component
public class ProductValidator implements Validator<Product> {

  @Override
  public Product validate(Product product) {
    if (isNull(product.getName())
    || isNull(product.getColor())
    || isNull(product.getProductionDateTime())
    || isNull(product.getSize())) {
      return null;
    }
    return product;
  }
}
