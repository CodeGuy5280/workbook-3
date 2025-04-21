package com.pluralsight;
import java.util.Scanner;

public class FamousQuotes {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] Quotes = {"Quote1", "Quote2", "Quote3", "Quote4", "Quote5", "Quote6", "Quote7", "Quote8", "Quote9", "Quote10"};

        System.out.println("Choose a quote (1 - 10: ");
        int i = scanner.nextInt();

        if (i >= 0 && i <= Quotes.length){
            System.out.println("Selected quote: " + Quotes[i]);
        }else {
            System.out.println("Invalid number.");
        }


        scanner.close();



    }
}
