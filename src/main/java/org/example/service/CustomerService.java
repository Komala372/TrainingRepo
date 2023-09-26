package org.example.service;

import org.example.pojo.Customer;
import org.example.pojo.Product;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    private ProductService productService = new ProductService();

    List<Customer> CustomerList = new ArrayList<>();

    public void registerCustomer(long id,String firstName,String lastName,double balance){
        CustomerList.add(new Customer(id,firstName,lastName,balance));
    }

    public void buyProduct(long CustomerId,long productId){
        List<Product> products = new ArrayList<>();
        System.out.println("Customer buying product");
        Customer customer  = findCustomerById(CustomerId);
        if(customer!= null){
            Product product = productService.findProductById(productId);
            if(product!=null){
                if(customer.getBalance()<= product.getPrice()){
                    double balance = customer.getBalance()-product.getPrice();
                    customer.setBalance(balance);
                    products.add(product);
                }
            }
        }
        customer.setProductsBought(products);
        System.out.println(customer.getProductsBought());
    }

    public Customer findCustomerById(long CustomerId){
        System.out.println("Inside findCustomerById");
        for (Customer customer:CustomerList) {
            if(customer.getId()== CustomerId){
                return customer;
            }
        }
        return null;
    }

    public List<Product> productBroughtByCustomer(long CustomerId){
        List<Product> products = new ArrayList<>();
        System.out.println("Inside productBroughtByCustomer");
        for (Customer customerList:CustomerList) {
            if(customerList.getId() == CustomerId){
                 products = customerList.getProductsBought();
                 return products;
            }

        }


        return null;
    }


}
