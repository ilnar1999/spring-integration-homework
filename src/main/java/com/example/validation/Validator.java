package com.example.validation;

public interface Validator<T> {
  T validate(T object);
}
