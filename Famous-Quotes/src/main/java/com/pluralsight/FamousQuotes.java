package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] Quotes = {"That which does not kill us makes us stronger", "Without music, life would be a mistake", "God is dead. God remains dead. And we have killed him", "To live is to suffer, to survive is to find some meaning in the suffering", "We love life, not because we are used to living, but because we are used to loving", "He who has a why to live can bear almost any how", "Be careful when you fight the monsters, lest you become one", "When you gaze long into an abyss the abyss also gazes into you", "One must still have chaos in oneself to be able to give birth to a dancing star", "I have often laughed at the weaklings who thought themselves good because they had no claws"};

        System.out.println("Type a number to reveal a quote (1 - 10: ");


        //input of an int is read by the scanner, then storing it in i
        int i = scanner.nextInt();
        //if the value typed is at least position 1 in the array && the value is within the range of the array
        if (i >= 1 && i <= Quotes.length) {
            //Need to have the "- 1" to subtrack position in the array to allow user input of 1 and 10 instead of 0 - 9.
            System.out.println("Selected quote: " + Quotes[i - 1]);
        } else {
            System.out.println("Invalid number.");
        }
        scanner.close();


    }
}
