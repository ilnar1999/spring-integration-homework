package com.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Slf4j
class ProductControllerTest {

  private final static String PRODUCTS_WEB_SERVICE_URL = "http://localhost:8080/products";

  private final RestTemplate restTemplate = new RestTemplate();

  @Test
  void createProduct() {
  }

  @Test
  void getProductById() {
    ResponseEntity<String> response = restTemplate
        .getForEntity(PRODUCTS_WEB_SERVICE_URL + "/get/1", String.class);
    log.info("Body {}", response.getBody());
  }

  @Test
  void getProductsByName() {
  }

  @Test
  void getAllProducts() {
  }

  @Test
  void deleteProductById() {
  }
}