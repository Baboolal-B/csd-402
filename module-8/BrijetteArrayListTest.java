/*
* 07/06/2025
* BrijetteArrayListTest.java
*
* This program collects integers from the 
* user and stores them in an ArrayList until 
* the user enters 0, which is also included in the list. 
* It then finds and displays the largest number in the list using a method called max.*/

import java.util.ArrayList;
import java.util.Scanner;

public class BrijetteArrayListTest {

    // Method to return the maximum Integer in the list
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }

        Integer max = list.get(0);
        for (Integer num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to stop and include it in the list):");

        while (true) {
            System.out.print("Enter an integer: ");
            int input = scanner.nextInt();
            numbers.add(input); // Add the input, even if it's 0
            if (input == 0) {
                break;
            }
        }

        Integer largest = max(numbers);
        System.out.println("The largest number in the list is: " + largest);
    }
}
