package org.shop;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {

    List<Product> productList = new ArrayList<>();

    public List<Product> getProductList() {
        return productList;
    }
    // GetProductByName
    public Product getProductByName(String productName){
        for (Product product: productList) {
            if (product.getName().equalsIgnoreCase(productName)){
                return product;}
        }
        return null;
    }
    //GetProductByID
    public Product getProductById(int productId){
        for (Product product: productList) {
            if (product.getId() == productId){
                return product;
            }

        }
        return null;
    }
}
