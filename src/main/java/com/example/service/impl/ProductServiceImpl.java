package com.example.service.impl;

import static java.util.Objects.isNull;

import com.example.model.Product;
import com.example.repository.ProductRepository;
import com.example.service.ProductService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

  private final ProductRepository productRepository;

  @Override
  public boolean createProduct(Product product) {
    if (isNull(product)) {
      return false;
    }
    productRepository.save(product);
    return true;
  }

  @Override
  public Product getProductById(Long id) {
    return productRepository.findById(id).orElse(null);
  }

  @Override
  public List<Product> getProductsByName(String name) {
    return productRepository.findByName(name);
  }

  @Override
  public List<Product> getAllProducts() {
    return productRepository.findAll();
  }

  @Override
  public boolean deleteProductById(Long id) {
    if (!existsProductById(id)) {
      return false;
    }
    productRepository.deleteById(id);
    return true;
  }

  @Override
  public boolean existsProductById(Long id) {
    return productRepository.existsById(id);
  }
}
