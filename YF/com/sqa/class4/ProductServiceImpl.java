package com.sqa.class4;

import java.math.BigDecimal;
import java.util.List;

public class ProductServiceImpl implements IProductService {

    @Override
    public Product addProduct(String name, Integer size, BigDecimal price) {
        Product product = new Product(name, size, price);
        return  product;
    }

    @Override
    public boolean editProduct(Product product) {
        return true;
    }

    @Override
    public boolean deleteProduct(List<Product> list, String name) {
        int i = 0;
        for (; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                break;
            }
        }
        list.remove(i);
        return true;
    }


    @Override
    public List<Product> selectProduct() {
        return List.of();
    }
}
