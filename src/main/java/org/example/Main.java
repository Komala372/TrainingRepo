package org.example;

import org.example.service.CustomerService;
import org.example.service.ProductService;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ProductService productService = new ProductService();
        productService.registerProduct(1,"TV",23000);
        productService.registerProduct(2,"Laptop",45000);
        productService.registerProduct(3,"IPhone",100000);

        CustomerService customerService = new CustomerService();
        customerService.registerCustomer(1,"Ram","Garg",900000);
        customerService.registerCustomer(2,"Alex","Bob",800000);
        customerService.registerCustomer(3,"Somya","Vipul",75000);

        //customerService.buyProduct(2,2);
        customerService.findCustomerById(1);
        productService.findProductById(3);
        customerService.buyProduct(1,3);
        customerService.buyProduct(2,1);
        customerService.productBroughtByCustomer(1);
        customerService.productBroughtByCustomer(3);
        }
}
