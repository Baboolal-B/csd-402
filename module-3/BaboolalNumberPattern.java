/*
* Brijette Baboolal
* 06/08/2025
* BaboolalNumberPattern.java
*
* This program crates a pyramid-like number pattern using nested 
* for loops, where each row follows a specific format of ascending and 
* descending powers of 2, ending with an @ symbol. 
*/

public class BaboolalNumberPattern {
     public static void main(String[] args) {
        int rows = 7;
        int maxWidth = 0;

        // First, calculate the maximum width needed
        for (int i = 0; i < rows; i++) {
            StringBuilder temp = new StringBuilder();

            // Add leading spaces
            for (int s = 0; s < rows - i - 1; s++) {
                temp.append("  ");
            }

            int num = 1;
            for (int j = 0; j <= i; j++) {
                temp.append(num).append(" ");
                num *= 2;
            }

            num /= 4; // reverse last multiply twice
            for (int j = 0; j < i; j++) {
                temp.append(num).append(" ");
                num /= 2;
            }

            int lineLength = temp.length();
            if (lineLength > maxWidth) {
                maxWidth = lineLength;
            }
        }

        // Now, print each line padded to align the '@'
        for (int i = 0; i < rows; i++) {
            StringBuilder line = new StringBuilder();

            for (int s = 0; s < rows - i - 1; s++) {
                line.append("  ");
            }

            int num = 1;
            for (int j = 0; j <= i; j++) {
                line.append(num).append(" ");
                num *= 2;
            }

            num /= 4;
            for (int j = 0; j < i; j++) {
                line.append(num).append(" ");
                num /= 2;
            }

            // Pad the line to match the max width + 1 (for one extra space before '@')
            while (line.length() < maxWidth + 1) {
                line.append(" ");
            }

            // Add one space then the @ symbol
            line.append(" @");

            // Print the final line
            System.out.println(line.toString());
        }
    }
}