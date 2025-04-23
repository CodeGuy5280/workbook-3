package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.io.BufferedWriter;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
//importing all necessary classes

public class userLog {
    String logFile = "logs.txt";
    DateTimeFormatter dateTimeLog = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    Boolean userInput = true;
    Scanner scanner = new Scanner(System.in);
    public void logActions(String action) {

        System.out.println("Would you like to launch the application (Y/N)? ");
        String launchApp = scanner.nextLine().toUpperCase();

        if (launchApp.equals("Y")){
            String timeLog = LocalDateTime.now().format(dateTimeLog);
            String logMessage = (timeLog + "The application is launching!");
        }else {
            System.out.println("Invalid input.");
        }
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
