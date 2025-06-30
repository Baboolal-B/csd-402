/*
* Brijette Baboolal
* 06/29/2025
* BaboolalUseFans.java
*
* This program is an extension from Module 6 program. */

import java.util.ArrayList;

public class BaboolalUseFans {
    // Method to display a single fan without using toString()
    public static void displayFan(BaboolalFanpt2 fan) {
        if (fan.isOn()) {
            System.out.println("Fan is ON");
            System.out.println("Speed: " + fan.getSpeed());
        } else {
            System.out.println("Fan is OFF");
        }
        System.out.println("Color: " + fan.getColor());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println(); // Line break
    }

    // Method to display a list of fans without using toString()
    public static void displayFanCollection(ArrayList<BaboolalFanpt2> fans) {
        int index = 1;
        for (BaboolalFanpt2 fan : fans) {
            System.out.println("=== Fan " + index + " ===");
            displayFan(fan);
            index++;
        }
    }

    public static void main(String[] args) {
        // Create a collection of fans
        ArrayList<BaboolalFanpt2> fanList = new ArrayList<>();

        BaboolalFanpt2 fan1 = new BaboolalFanpt2(); // Default fan
        BaboolalFanpt2 fan2 = new BaboolalFanpt2(BaboolalFanpt2.FAST, true, 10.5, "blue");
        BaboolalFanpt2 fan3 = new BaboolalFanpt2(BaboolalFanpt2.SLOW, false, 7.0, "green");

        // Modify fan1
        fan1.setOn(true);
        fan1.setSpeed(BaboolalFanpt2.MEDIUM);
        fan1.setColor("black");
        fan1.setRadius(8.0);

        // Add fans to collection
        fanList.add(fan1);
        fanList.add(fan2);
        fanList.add(fan3);

        // Display the fans using custom display methods
        System.out.println("=== Displaying All Fans in Collection ===");
        displayFanCollection(fanList);
    }
}
