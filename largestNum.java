//Ask for three numbers and return the largest number

import java.util.Scanner;

public class LargestNum {

        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                // Read the three numbers
                System.out.println("Enter the first number:");
                int n1 = input.nextInt();
                System.out.println("Enter the second number:");
                int n2 = input.nextInt();
                System.out.println("Enter the third number:");
                int n3 = input.nextInt();

                // Determine the largest number
                int largest = n1;
                if (n2 > largest) {
                        largest = n2;
                }
                if (n3 > largest) {
                        largest = n3;
                }

                // Print the largest number
                System.out.println("The largest number is: " + largest);
    }
}

/*

n1 = int(input("Enter the first number: "))
n2 = int(input("Enter the second number: "))
n3 = int(input("Enter the third number: "))

largest = n1
if n2 > largest:
        largest = n2
if n3 > largest:
        largest = n3

print("The largest number is: ", largest)

*/
