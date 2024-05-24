/* build an algorithm that allows you to calculate
the area of a triangle, read the base,
the height and print the result */

import java.util.Scanner;

public class divisionResiduo {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        double num1, num2, remainder, quotient;

        System.out.println("Enter the first number:");
        num1 = read.nextDouble();
        System.out.println("Enter the second number:");
        num2 = read.nextDouble();

        quotient = num1 / num2;
        remainder = num1 % num2; 

        System.out.println("The quotient is: " + quotient);
        System.out.println("The remainder is: " + remainder);
    }
}
