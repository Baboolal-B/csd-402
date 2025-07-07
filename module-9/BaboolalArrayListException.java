/*
* 07/06/2025
* BaboolalArrayListException.java
*
* This program creates a file named data.file (if it doesn't already exist) 
* and appends 10 randomly generated integers to it, each separated by a space. 
* After writing, it reopens the file, reads its contents, and displays the data 
* line by line in the console..*/

import java.util.ArrayList;
import java.util.Scanner;

public class BaboolalArrayListException {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        
        // Fill with at least 10 strings
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");
        stringList.add("Elderberry");
        stringList.add("Fig");
        stringList.add("Grape");
        stringList.add("Honeydew");
        stringList.add("Kiwi");
        stringList.add("Lemon");

        System.out.println("ArrayList contents:");
        for (String item : stringList) {
            System.out.println(item);
        }

        Scanner scanner = new Scanner(System.in);

        // Ask user which element to see again
        System.out.print("\nEnter the index (0-9) of the item you'd like to see again: ");

        // Demonstrating auto-unboxing (Integer to int)
        Integer userInput = null;
        try {
            userInput = Integer.parseInt(scanner.nextLine()); // Autoboxing
            System.out.println("You selected: " + stringList.get(userInput)); // Auto-unboxing
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
        }

        scanner.close();
    }
}
