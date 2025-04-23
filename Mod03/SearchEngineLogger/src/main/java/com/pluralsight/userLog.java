package com.pluralsight;

import java.io.BufferedInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.io.BufferedWriter;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
//importing all necessary classes

public class userLog {
    String logFile = "logs.txt";
    DateTimeFormatter dateTimeLog = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    //Boolean userInput = true;
    Scanner scanner = new Scanner(System.in);
    public void logActions() {

        //launching app
        System.out.println("Would you like to launch the application (Y/N)? ");
        String launchApp = scanner.nextLine().toUpperCase();


        if (launchApp.equals("Y")){
            String timeLog = LocalDateTime.now().format(dateTimeLog);
            String logMessage = (timeLog + "The application is launching!");

            System.out.println(logMessage);
            writeLog(logMessage);
        }else {
            System.out.println("Invalid input.");
        }
        //search
        System.out.println("What would you like to search?: ");
        String searchApp = scanner.nextLine();
        System.out.println("Searching for: " + searchApp);
        System.out.println("Results for " + searchApp + ".");

        System.out.println("Exiting the application.");

    }
    public void writeLog(String write){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))){
            writer.write(write);
            writer.newLine();
        }catch (IOException e){
            System.out.println("Failed to write: " + e.getMessage());
        }
    }


}
