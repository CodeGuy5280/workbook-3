package com.pluralsight;
import java.io.*;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FileReader reader;
        try {
            //Windows
            //reader = new FileReader("C:/Users/AlexJ/pluralsight/workbook-3/Mod01/BedtimeStories/src/main/java/com/pluralsight/DataFiles/employees.csv");
            //Mac
            reader = new FileReader("/Users/alexsmac/pluralsight/workbook-3/Mod01/BedtimeStories/src/main/java/com/pluralsight/DataFiles/employees.csv");
            BufferedReader bufferedReader = new BufferedReader(reader);

            Employee[] employees = new Employee[8];
            int lineIndex = 0;
            String input;

            while ((input = bufferedReader.readLine()) != null) {
                String[] lineData = input.split("\\|");

                if (lineData[0].equals("id")) {
                    continue; // Skip header row
                }

                int id = Integer.parseInt(lineData[0]);
                String name = lineData[1];
                double hours = Double.parseDouble(lineData[2]);
                double rate = Double.parseDouble(lineData[3]);

                Employee newEmployee = new Employee(id, name, hours, rate);
                employees[lineIndex] = newEmployee;

                System.out.printf("ID: %d | Name: %s | Pay: $%.2f%n", newEmployee.getEmployeeId(), newEmployee.getName(), newEmployee.calculateGrossPay());

                lineIndex++;
            }

            bufferedReader.close();
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
