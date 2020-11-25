package com.example.converter;

public interface Converter<T, D> {

  T toEntity(D dto);
}
