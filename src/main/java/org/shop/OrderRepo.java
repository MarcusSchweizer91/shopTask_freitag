package org.shop;

import java.util.ArrayList;
import java.util.List;

public class OrderRepo {

    //orders
    List<Order>orderList = new ArrayList<>();

    //Getter - list()
    public List<Order> getOrderList(){
        return orderList;
    }

    // GetOrderByID - get()
    public Order getOrderByID(int orderID){
        for (Order order: orderList){
            if(order.getOrderID() == orderID){
                return order;
            }
        }
        return null;
    }

    //Add Order - add()
    public void addOrder(Order order){
        orderList.add(order);
    }



}
