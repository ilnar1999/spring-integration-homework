package com.example.model.dto;

import com.example.model.Size;
import lombok.Data;

@Data
public class ProductDto {

  private String name;
  private String color;
  private String productionDateTime;
  private Size size;
}
