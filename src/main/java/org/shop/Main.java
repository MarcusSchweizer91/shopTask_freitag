package org.shop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product dildo= new Product("Banane");
        Product gummipuppe= new Product("Chantal");
        Product latexanzugFrau= new Product("Catwoman");
        Product latexanzugMann= new Product("Batman");
        Product costum= new Product("Ironman");
        Product penispumpe= new Product("BigBang");

        List<Product>productList=new ArrayList<>();
        productList.add(dildo);
        productList.add(gummipuppe);
        productList.add(latexanzugFrau);
        productList.add(latexanzugMann);
        productList.add(costum);
        productList.add(penispumpe);


        ShopService derGoldeneSchritt= new ShopService();



        Order order=new Order(productList);

        derGoldeneSchritt.addOrder(order);

        for (Order o:derGoldeneSchritt.listOrders()) {
            System.out.println(o);
        }

        System.out.println("\n");
        // Hier noch ein Fehler bei der Ausgabe
        for (Product p:derGoldeneSchritt.listProducts()) {
            System.out.println(p.getName());
        }



    }
}