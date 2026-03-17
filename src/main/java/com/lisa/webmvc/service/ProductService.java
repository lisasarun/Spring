package com.lisa.webmvc.service;

import com.lisa.webmvc.dto.CreateProductRequest;
import com.lisa.webmvc.dto.ProductResponse;

public interface ProductService {

    ProductResponse createNewProduct(CreateProductRequest createProductRequest);
}
