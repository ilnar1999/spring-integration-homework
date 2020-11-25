package com.example.service;

import com.example.model.Product;
import java.util.List;

public interface ProductService {

  boolean createProduct(Product product);

  Product getProductById(Long id);

  List<Product> getProductsByName(String name);

  List<Product> getAllProducts();

  boolean deleteProductById(Long id);

  boolean existsProductById(Long id);
}
