package com.example.endpoint;

import com.example.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@RequiredArgsConstructor
public class ProductEndpoint {

  private static final String NAMESPACE_URI = "http://www.baeldung.com/springsoap/gen";

  private final ProductService productService;

//  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getProductRequest")
//  @ResponsePayload
//  public GetProductResponse getProductById(@RequestPayload GetProductRequest request) {
//    GetProductResponse response = new GetProductResponse();
//    response.setProduct(productService.getProductById(request.getId()));
//    return response;
//  }
}
