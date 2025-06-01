/*
 * Brijette Baboolal
 * 06/01/2025
 * BaboolalCalculateEnergy.java
 *
 * This program calculates the energy needed to heat water
 * from an initial temperature to a final temperature.
 */

import java.util.Scanner;

public class BaboolalCalculateEnergy {

    // Method to calculate energy
    public static double calculateEnergy(double mass, double initialTemp, double finalTemp) {
        final double SPECIFIC_HEAT = 4184; // in J/(kg°C)
        return mass * (finalTemp - initialTemp) * SPECIFIC_HEAT;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Energy Needed to Heat Water Calculator");

        try {
            // Prompt user for inputs
            System.out.print("Enter the amount of water in kilograms: ");
            double waterMass = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter the initial temperature in Celsius: ");
            double initialTemp = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter the final temperature in Celsius: ");
            double finalTemp = Double.parseDouble(scanner.nextLine());

            // Calculate and display the result
            double energyNeeded = calculateEnergy(waterMass, initialTemp, finalTemp);
            System.out.printf("%nThe energy needed to heat the water is %.2f Joules.%n", energyNeeded);

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numeric inputs.");
        }

        scanner.close();
    }
}
