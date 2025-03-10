package com.sqa.class4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        IProductService productService = new ProductServiceImpl();

        Product product = productService.addProduct("Milk", 10, new BigDecimal(10.5));
        Product product1 = productService.addProduct("Milk1", 10, new BigDecimal(100.5));
        Product product2 = productService.addProduct("Milk2", 10, new BigDecimal(1000.5));

        list.add(product);
        list.add(product1);
        list.add(product2);

        for (Product p : list) {
            System.out.println(p.getName() + "," + p.getSize() + "," + p.getPrice());
        }

        System.out.println("----------------------------------------------------------------");

        list.get(1).setName("Milk100");
        productService.editProduct(list.get(1));
        for (Product p : list) {
            System.out.println(p.getName() + "," + p.getSize() + "," + p.getPrice());
        }

        System.out.println("----------------------------------------------------------------");
        productService.deleteProduct(list, "Milk2");
        for (Product p : list) {
            System.out.println(p.getName() + "," + p.getSize() + "," + p.getPrice());
        }
    }
}
