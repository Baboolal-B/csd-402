/*
* Brijette Baboolal
* 06/20/2025
* BaboolalArrayLocator.java
*
* This program methods to find the location of the largest 
* and smallest elements in both int[][] and double[][] arrays. 
* Each method returns a one-dimensional array containing the row 
* and column of the found element. The main method demonstrates 
* these methods using sample arrays and prints out the locations.
*/

public class BaboolalArrayLocator {

    // Locate largest in double[][]
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = new int[2];
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    // Locate largest in int[][]
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = new int[2];
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    // Locate smallest in double[][]
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = new int[2];
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    // Locate smallest in int[][]
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = new int[2];
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    // Test the methods
    public static void main(String[] args) {
        int[][] intArray = {
            {1, 5, 3},
            {7, 2, 9},
            {4, 6, 0}
        };

        double[][] doubleArray = {
            {2.5, 3.7, 1.1},
            {9.2, 0.4, 6.3},
            {4.8, 5.5, 7.0}
        };

        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);
        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        System.out.println("Largest in int[][] located at: (" + largestInt[0] + ", " + largestInt[1] + ")");
        System.out.println("Smallest in int[][] located at: (" + smallestInt[0] + ", " + smallestInt[1] + ")");
        System.out.println("Largest in double[][] located at: (" + largestDouble[0] + ", " + largestDouble[1] + ")");
        System.out.println("Smallest in double[][] located at: (" + smallestDouble[0] + ", " + smallestDouble[1] + ")");
    }
}
