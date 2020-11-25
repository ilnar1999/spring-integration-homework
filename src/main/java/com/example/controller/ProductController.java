package com.example.controller;

import static com.example.constant.Url.*;
import static org.springframework.http.ResponseEntity.ok;

import com.example.converter.impl.ProductConverter;
import com.example.model.Product;
import com.example.model.dto.ProductDto;
import com.example.service.ProductService;
import com.example.validation.impl.ProductValidator;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(PRODUCTS)
@RequiredArgsConstructor
public class ProductController {

  private final ProductService productService;
  private final ProductConverter productConverter;
  private final ProductValidator productValidator;

  @PostMapping(CREATE)
  public ResponseEntity<Boolean> createProduct(@RequestBody ProductDto productDto) {
    Product product = productConverter.toEntity(productDto);
    product = productValidator.validate(product);
    return ok(productService.createProduct(product));
  }

  @GetMapping(GET_BY_ID)
  public ResponseEntity<Product> getProductById(@PathVariable("id") Long id) {
    return ok(productService.getProductById(id));
  }

  @GetMapping(GET_BY_NAME)
  public ResponseEntity<List<Product>> getProductsByName(@PathVariable("name") String name) {
    return ok(productService.getProductsByName(name));
  }

  @GetMapping(GET)
  public ResponseEntity<List<Product>> getAllProducts() {
    return ok(productService.getAllProducts());
  }

  @PostMapping(DELETE_BY_ID)
  public ResponseEntity<Boolean> deleteProductById(@PathVariable("id") Long id) {
    return ok(productService.deleteProductById(id));
  }
}
