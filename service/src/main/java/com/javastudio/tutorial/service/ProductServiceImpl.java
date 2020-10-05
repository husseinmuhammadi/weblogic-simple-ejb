package com.javastudio.tutorial.service;

import com.javastudio.tutorial.api.ProductService;
import com.javastudio.tutorial.dto.Product;

import javax.ejb.Local;
import javax.ejb.Stateless;
import java.util.Arrays;
import java.util.List;

@Local
@Stateless
public class ProductServiceImpl implements ProductService {
    @Override
    public List<Product> findAll() {
        return Arrays.asList(new Product("Nail"), new Product("Wooden chair"), new Product("Desk"));
    }
}
