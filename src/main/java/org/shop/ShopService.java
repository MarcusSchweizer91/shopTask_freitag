package org.shop;

import java.util.List;

public class ShopService {

    // erstellen der Attribute für nachfolgende Methoden
    ProductRepo productRepo= new ProductRepo();
    OrderRepo orderRepo= new OrderRepo();


    //Methoden
    //get() Name & ID
    public Product getProduct(String name){
        return productRepo.getProductByName(name);
    }
    public Product getProduct(int id){
        return productRepo.getProductById(id);
    }
    //list()
    public List<Product>listProducts(){
        return productRepo.getProductList();
    }

    //add() Order
    public void addOrder(Order order){
        orderRepo.addOrder(order);
    }

    //getOrder() by ID
    public Order getOrder(int id){
        return orderRepo.getOrderByID(id);
    }

    // listOrders()
    public List<Order>listOrders(){
        return orderRepo.getOrderList();
    }


}
