//Calculate the number of pulses
//that a person should have for every
//10 seconds of exercise, if the formula is:
//... Number of Pulses = (220 - age)/10
//... Read the age and print the number of pulses.

import java.util.Scanner;

public class beats {

    public static void main(String[] args) {
        //Read the age
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        //Calculating the number of pulses
        double pulses = (220 - age) / 10.0;

        //Print the number of pulses
        System.out.println("The number of pulses per 10 seconds of exercise is: " + pulses);
    }
}
