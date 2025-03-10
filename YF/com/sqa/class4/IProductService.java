package com.sqa.class4;

import java.math.BigDecimal;
import java.util.List;

public interface IProductService {
    Product addProduct(String name, Integer size, BigDecimal price);

    boolean editProduct(Product product);

    boolean deleteProduct(List<Product> list, String name);

    List<Product> selectProduct();
}
