/*
* 07/06/2025
* BaboolalFileRandomNumbers.java
*
* This program collects integers from the 
* user and stores them in an ArrayList until 
* the user enters 0, which is also included in the list. 
* It then finds and displays the largest number in the list using a method called max.*/

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class BaboolalFileRandomNumbers {
    public static void main(String[] args) {
        String fileName = "data.file";
        File file = new File(fileName);
        Random rand = new Random();

        try (FileWriter fw = new FileWriter(file, true)) { // true = append mode
            System.out.println("Writing 10 random numbers to file...");
            for (int i = 0; i < 10; i++) {
                int number = rand.nextInt(101); // 0 to 100
                fw.write(number + " ");
            }
            fw.write("\n"); // Add a new line after 10 numbers
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        System.out.println("\nReading contents of the file:");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
