/*
* 07/25/2025
* Brijette Baboolal
* BaboolalAutoService.java
*
* This program calculates the total cost of a yearly auto service
* using four overloaded yearlyService methods, each handling different
* combinations of service options like oil changes, tire rotations, and 
* coupon discounts. The main method tests each version twice, displaying 
* the total service cost based on the provided inputs.*/

public class BaboolalAutoService {

    // Method 1: No parameters
    public static double yearlyService() {
        double standardService = 200.0;
        return standardService;
    }

    // Method 2: One parameter - oil change fee
    public static double yearlyService(double oilChangeFee) {
        double standardService = 200.0;
        return standardService + oilChangeFee;
    }

    // Method 3: Two parameters - oil change fee + tire rotation fee
    public static double yearlyService(double oilChangeFee, double tireRotationFee) {
        double standardService = 200.0;
        return standardService + oilChangeFee + tireRotationFee;
    }

    // Method 4: Three parameters - oil change fee + tire rotation fee - coupon
    public static double yearlyService(double oilChangeFee, double tireRotationFee, double coupon) {
        double standardService = 200.0;
        double total = standardService + oilChangeFee + tireRotationFee - coupon;
        return total;
    }

    public static void main(String[] args) {
        // Testing method with no parameters
        System.out.println("Test 1 (no params): $" + yearlyService());
        System.out.println("Test 2 (no params): $" + yearlyService());

        // Testing method with 1 parameter (oil change fee)
        System.out.println("Test 1 (1 param): $" + yearlyService(50.0));
        System.out.println("Test 2 (1 param): $" + yearlyService(60.0));  // Different fee

        // Testing method with 2 parameters (oil + tire)
        System.out.println("Test 1 (2 params): $" + yearlyService(50.0, 30.0));
        System.out.println("Test 2 (2 params): $" + yearlyService(55.0, 35.0));  // Different fees

        // Testing method with 3 parameters (oil + tire - coupon)
        System.out.println("Test 1 (3 params): $" + yearlyService(50.0, 30.0, 20.0));
        System.out.println("Test 2 (3 params): $" + yearlyService(60.0, 35.0, 25.0));  // Different fees and coupon
    }
}
