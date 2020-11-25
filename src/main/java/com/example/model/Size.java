package com.example.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Size implements Serializable {

  private Double length;
  private Double width;
  private Double height;
}
