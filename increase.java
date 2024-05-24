// Calculate the new salary of an employee, knowing that there was a
// 25% increase over their previous salary.

import java.util.Scanner;

public class salaryIncrease {

    public static void main(String[] args) {
    
        // Declare variables
        double previousSalary;
        double increase;
        double newSalary;

        // Create a Scanner object to read the user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the previous salary
        System.out.print("Enter the previous salary: ");
        previousSalary = scanner.nextDouble();

        // Calculate the 25% increase
        increase = previousSalary * 0.25;

        // Calculate the new salary
        newSalary = previousSalary + increase;

        // Display the new salary
        System.out.println("The new salary is: " + newSalary);
    }
}