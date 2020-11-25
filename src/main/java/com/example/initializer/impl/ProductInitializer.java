package com.example.initializer.impl;

import com.example.model.Product;
import com.example.model.Size;
import com.example.initializer.Initializer;
import com.example.service.ProductService;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductInitializer implements Initializer {

  private final ProductService productService;

  private static final String DATE_TIME_PATTERN = "dd-MM-yyyy HH:mm:ss";

  @PostConstruct
  @Override
  public void init() {
    if (!productService.getAllProducts().isEmpty()) {
      return;
    }

    Product product = Product.builder()
        .name("table")
        .color("brown")
        .productionDateTime(
            LocalDateTime.now().format(DateTimeFormatter.ofPattern(DATE_TIME_PATTERN)))
        .size(new Size(70.0, 120.0, 80.0))
        .build();
    productService.createProduct(product);

    product = Product.builder()
        .name("laptop")
        .color("grey")
        .productionDateTime(
            LocalDateTime.now().format(DateTimeFormatter.ofPattern(DATE_TIME_PATTERN)))
        .size(new Size(20.0, 35.0, 5.0))
        .build();
    productService.createProduct(product);

    product = Product.builder()
        .name("smartphone")
        .color("black")
        .productionDateTime(
            LocalDateTime.now().format(DateTimeFormatter.ofPattern(DATE_TIME_PATTERN)))
        .size(new Size(12.0, 5.5, 0.7))
        .build();
    productService.createProduct(product);
  }
}
