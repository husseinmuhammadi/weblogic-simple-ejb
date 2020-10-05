package com.javastudio.tutorial.api;

import com.javastudio.tutorial.dto.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
}
