package com.example.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import com.example.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductServiceImplTest {

  @Autowired
  private ProductService productService;


  @BeforeEach
  void setUp() {
  }

  @Test
  void createProduct() {
  }

  @Test
  void getProductById() {
  }

  @Test
  void getProductsByName() {
  }

  @Test
  void deleteProductById() {
  }

  @Test
  void existsProductById() {
  }
}