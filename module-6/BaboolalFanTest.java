/*
* Brijette Baboolal
* 06/20/2025
* BaboolalFanTest.java
*
* This program tests BaboolalFan.
*/

public class BaboolalFanTest {
    public static void main(String[] args) {
        // Create Fan using no-arg constructor
        BaboolalFan defaultFan = new BaboolalFan();

        // Create Fan using parameterized constructor
        BaboolalFan customFan = new BaboolalFan(BaboolalFan.FAST, true, 10.5, "blue");

        // Display fan states
        System.out.println("=== Default Fan ===");
        System.out.println(defaultFan);

        System.out.println("\n=== Custom Fan ===");
        System.out.println(customFan);

        // Modify defaultFan using setters
        defaultFan.setOn(true);
        defaultFan.setSpeed(BaboolalFan.MEDIUM);
        defaultFan.setColor("black");
        defaultFan.setRadius(8.0);

        System.out.println("\n=== Modified Default Fan ===");
        System.out.println(defaultFan);
    }
}
