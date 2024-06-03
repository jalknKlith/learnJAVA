/* Calculate the new salary of an employee
// ... 25% increase over their previous salary */

import java.util.Scanner;

public class increase {

    public static void main(String[] args) {
    
        double prevSalary, increase, newSalary
        Scanner input = new Scanner(System.in);

        // Ask the user for the previous salary
        System.out.print("Enter the previous salary: ");
        prevSalary = input.nextDouble();

        // Calculate the 25% increase
        increase = prevSalary * 0.25;

        // Calculate the new salary
        newSalary = prevSalary + increase;

        // Display the new salary
        System.out.println("The new salary is: " + newSalary);
    }
}

/*

prevSalary = int(input("Entre previous salary: "))
increase = prevSalary * 0.25
newSalary = prevSalary + increase
print("The new salary is: ", newSalary")

*/
