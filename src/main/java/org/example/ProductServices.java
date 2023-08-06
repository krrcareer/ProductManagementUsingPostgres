package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductServices {

    List<Product> products = new ArrayList<>();
    ProductDB productDB = new ProductDB();

    public void addProduct(Product p){
        products.add(p);

        productDB.addProductDB(p);
    }

    public List<Product> getAllProducts(){
        //return products;
        return productDB.getAllProductDB();
    }

    public Product getProductByName(String str){
        Product pTemp = null;
        for(Product p : products){
            if(p.getName().equals(str))
                pTemp = p;
        }
        if(pTemp!=null)
            return pTemp;
        else
            return new Product("x", "y", "z", 1);
    }

    public List<Product> getProductByText(String s){
        List<Product> pTemp = new ArrayList<>();
        String txt = s.toLowerCase();
        for(Product p : products){
            String name = p.getName().toLowerCase();
            String place = p.getPlace().toLowerCase();
            String type = p.getType().toLowerCase();
            if(name.contains(txt) || place.contains(txt) || type.contains(txt)){
                pTemp.add(p);
            }
        }
        return pTemp;
    }

    public List<Product> getProductByPlace(String s){
        List<Product> pTemp = new ArrayList<>();
        String sPlace = s.toLowerCase();
        for(Product p : products){
            String place = p.getPlace().toLowerCase();
            if(place.equals(sPlace))
                pTemp.add(p);
        }
        return pTemp;
    }

    public List<Product> getProductOutOfWarranty(){
        List<Product> pTemp = new ArrayList<>();
        for(Product p : products){
            if(p.getWarranty()>2023)
                pTemp.add(p);
        }
        return pTemp;
    }
}
