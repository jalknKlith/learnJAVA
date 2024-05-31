import java.util.Scanner;

public class divisionResiduo {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        double num1, num2, remainder, quotient;
        //Ask for the numbers
        System.out.println("Enter the first number:");
        num1 = sc.nextDouble();
        System.out.println("Enter the second number:");
        num2 = sc.nextDouble();
        //make the operations
        quotient = num1 / num2;
        remainder = num1 % num2; 
        //print the results
        System.out.println("The quotient is: " + quotient);
        System.out.println("The remainder is: " + remainder);
    }
}
