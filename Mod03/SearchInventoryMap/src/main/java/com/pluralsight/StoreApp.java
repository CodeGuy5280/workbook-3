package com.pluralsight;

import java.util.HashMap;
import java.util.Scanner;

public class StoreApp {
    static HashMap<Integer, Product> inventory = new HashMap<>();

    public static void main(String[] args) {
        loadInventory();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("What item # are you interested in? ");
            int id = scanner.nextInt();
            Product matchedProduct = inventory.get(id);
            if (matchedProduct == null) {
                System.out.println("We don't carry that product");
            } else {
                System.out.printf("We carry %s and the price is $%.2f\n",
                        matchedProduct.getName(), matchedProduct.getPrice());
            }

            scanner.nextLine(); // consume leftover newline
            System.out.println("Would you like to search again? (Y/N): ");
            String answer = scanner.nextLine().trim().toLowerCase();
            if (!answer.equals("y")) {
                System.out.println("Thanks for visiting!");
                break;
            }
        }
    }

    public static void loadInventory() {
        inventory.put(1, new Product(1, "Cheese", 9.99f));
        inventory.put(2, new Product(2, "Toast", 5.50f));
        inventory.put(3, new Product(3, "Banana", 2.00f));
    }
}
