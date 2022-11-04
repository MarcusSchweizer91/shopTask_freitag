package org.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {

    private int orderID;
    private static int orderIdCounter = 1;

    private List<Product> productList= new ArrayList<>();

    //Konstruktoren


    public Order() {
    }

    public Order(List<Product> productList) {
        this.productList = productList;
        orderID = orderIdCounter;
        orderIdCounter ++;
    }

    //Getter & Setter

    public int getOrderID() {
        return orderID;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    //Equals, HashCode, toString

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (orderID != order.orderID) return false;
        return Objects.equals(productList, order.productList);
    }

    @Override
    public int hashCode() {
        int result = orderID;
        result = 31 * result + (productList != null ? productList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", productList=" + productList +
                '}';
    }
}
