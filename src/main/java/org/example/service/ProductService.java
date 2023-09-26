package org.example.service;

import org.example.pojo.Product;


import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> productList = new ArrayList<>();

    public void registerProduct(long id,String name, double price){
        productList.add(new Product(id,name,price));
    }

    public Product findProductById(long id){
        System.out.println("Inside findProductById");
        for (Product list:productList) {
            if(list.getId()==id){
                System.out.println(list.getName());
                return list;
            }
        }
        return null;
    }

}
