package com.pluralsight;
import java.util.HashMap;
import java.util.Scanner;

public class StoreApp {
    // the key is the product id, the value is a product object
    static HashMap<Integer, Product> inventory = new HashMap<>();
    public static void main(String[] args) {
    // this method loads product objects into inventory
        loadInventory();

            Scanner scanner = new Scanner(System.in);
            System.out.print("What item # are you interested in? ");
            int id = scanner.nextInt();
            Product matchedProduct = inventory.get(id);
            if (matchedProduct == null) {
                System.out.println("We don't carry that product");
                return;
            }
            System.out.printf("We carry %s and the price is $%.2f",
                    matchedProduct.getName(), matchedProduct.getPrice());


        }
        public static void loadInventory() {
            inventory.put(1, new Product(1, "Cheese", 9.99f));
            inventory.put(2, new Product(2, "Toast", 5.50f));
            inventory.put(3, new Product(3, "Banana", 2.00f));
        }
    }
