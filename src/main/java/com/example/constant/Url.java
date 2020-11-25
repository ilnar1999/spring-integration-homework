package com.example.constant;

public class Url {

  public static final String PRODUCTS = "/products";
  public static final String ID = "/{id}";
  public static final String NAME = "/{name}";
  public static final String CREATE = "/create";
  public static final String GET = "/get";
  public static final String GET_BY_NAME = GET + "/by_name" + NAME;
  public static final String GET_BY_ID = GET + ID;
  public static final String DELETE = "/delete";
  public static final String DELETE_BY_ID = DELETE + ID;

  private Url() {
  }
}
