import java.util.Scanner;

public class divisionResiduo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double num1, num2, remainder, quotient;

        System.out.println("Enter the first number:");
        num1 = sc.nextDouble();
        System.out.println("Enter the second number:");
        num2 = sc.nextDouble();

        quotient = num1 / num2;
        remainder = num1 % num2; 

        System.out.println("The quotient is: " + quotient);
        System.out.println("The remainder is: " + remainder);
    }
}
