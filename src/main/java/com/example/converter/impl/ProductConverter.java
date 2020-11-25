package com.example.converter.impl;

import com.example.converter.Converter;
import com.example.model.Product;
import com.example.model.dto.ProductDto;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter implements Converter<Product, ProductDto> {

  @Override
  public Product toEntity(ProductDto dto) {
    return Product.builder()
        .name(dto.getName())
        .color(dto.getColor())
        .productionDateTime(dto.getProductionDateTime())
        .size(dto.getSize())
        .build();
  }
}
