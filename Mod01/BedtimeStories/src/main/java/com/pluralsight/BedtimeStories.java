package com.pluralsight;
import java.io.*;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {

        try {
            //need to assign stories to an array to access each
//"C:/Users/AlexJ/pluralsight//workbook-3/Mod01/BedtimeStories/src/main/java/com/pluralsight/DataFiles/goldilocks.txt"
            FileInputStream fis = new FileInputStream("C:/Users/AlexJ/pluralsight//workbook-3/Mod01/BedtimeStories/src/main/java/com/pluralsight/DataFiles/goldilocks.txt");
            Scanner scanner = new Scanner(fis);

            while (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                System.out.println(input);

            }

            scanner.close();
            
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
