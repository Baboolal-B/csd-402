/*
* Brijette Baboolal
* 06/15/2025
* BaboolalAverageCalculator.java
*
* This program invokes each (short [ ] array), (int [ ] array), (long [ ] array), and 
* (double [ ] array). Then displays the average value returned along with a display 
* of the original array elements. 
*/

import java.util.Arrays;

public class BaboolalAverageCalculator {

    // Overloaded method for short[]
    public static short average(short[] array) {
        int sum = 0;
        for (short value : array) {
            sum += value;
        }
        return (short)(sum / array.length);
    }

    // Overloaded method for int[]
    public static int average(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // Overloaded method for long[]
    public static long average(long[] array) {
        long sum = 0;
        for (long value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // Overloaded method for double[]
    public static double average(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        // Test short array
        short[] shortArray = {2, 4, 6};
        System.out.println("short array: " + Arrays.toString(shortArray));
        System.out.println("Average: " + average(shortArray));
        System.out.println();

        // Test int array
        int[] intArray = {10, 20, 30, 40};
        System.out.println("int array: " + Arrays.toString(intArray));
        System.out.println("Average: " + average(intArray));
        System.out.println();

        // Test long array
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        System.out.println("long array: " + Arrays.toString(longArray));
        System.out.println("Average: " + average(longArray));
        System.out.println();

        // Test double array
        double[] doubleArray = {5.5, 10.0, 15.5, 20.0, 25.5, 30.0};
        System.out.println("double array: " + Arrays.toString(doubleArray));
        System.out.println("Average: " + average(doubleArray));
    }
}
