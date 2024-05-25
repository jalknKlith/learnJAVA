//Ask fir three numbers and return the largest number

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the three numbers
        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();
        System.out.println("Enter the third number:");
        int number3 = scanner.nextInt();

        // Determine the largest number
        int largest = number1;
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

        // Print the largest number
        System.out.println("The largest number is: " + largest);
    }
}
