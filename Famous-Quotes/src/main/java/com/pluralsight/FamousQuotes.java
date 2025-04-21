package com.pluralsight;
import java.util.Scanner;

public class FamousQuotes {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] Quotes = {"Quote1", "Quote2", "Quote3", "Quote4", "Quote5", "Quote6", "Quote7", "Quote8", "Quote9", "Quote10"};

        System.out.println("Choose a quote (1 - 10: ");
        int i = scanner.nextInt();

        if (i >= 1 && i <= Quotes.length){
            //Need to have the "- 1" to subtrack position in the array to allow user input of 1 and 10 instead of 0 - 9.
            System.out.println("Selected quote: " + Quotes[i - 1]);
        }else {
            System.out.println("Invalid number.");
        }


        scanner.close();



    }
}
