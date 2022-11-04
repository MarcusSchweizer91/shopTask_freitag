package org.shop;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    List<Product> productList = new ArrayList<>();

    public ProductRepo(List<Product> productList) {
        this.productList = productList;
    }

    public ProductRepo() {}

    public List<Product> getProductList() {
        return productList;
    }

    public Product getProductByName(String name){
        for(Product c : productList){
            if(c.getName().equalsIgnoreCase(name)){
                return c;
            }
        }
        return null;
    }
    public Product getProductById(int id){
        for(Product c : productList){
            if(c.getId() == id){
                return c;
            }
        }
        return null;
    }
}
