package org.example;

import java.util.List;

public class Main {

    public static void main(String[] args){

        ProductServices productServices = new ProductServices();

//        productServices.addProduct(new Product("HP Laptop", "Wood Drawer", "Laptop", 2025));
//        productServices.addProduct(new Product("MacBook Air", "Study Table", "Laptop", 2024));
//        productServices.addProduct(new Product("Pixel 4a", "Bed", "Phone", 2023));
//        productServices.addProduct(new Product("Mivi Earpod", "Study Table", "Earphone", 2024));
//        productServices.addProduct(new Product("Smart Watch", "Wood Drawer", "Watch", 2022));
//        productServices.addProduct(new Product("iPhone SE", "Wood Drawer", "Phone", 2020));

        List<Product> apl = productServices.getAllProducts();
        System.out.println(apl);

//        Product p = productServices.getProductByName("HP");
//        System.out.println(p);
//
//        List<Product> pbt = productServices.getProductByText("Laptop");
//        System.out.println(pbt);
//
//        List<Product> pbp = productServices.getProductByPlace("Bed");
//        System.out.println(pbp);
//
//        List<Product> spow = productServices.getProductOutOfWarranty();
//        System.out.println(spow);
    }
}
