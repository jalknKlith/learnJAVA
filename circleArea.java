/*This program calculates the area of a circle,
reading the radius and printing the area.*/

import java.util.Scanner;

public class circleArea {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                double radio, area;

                System.out.println("Enter the circle radius");
                radio = sc.nextDouble();

                area = Math.PI * Math.pow(radio, 2);

                System.out.println("The area is: " + area);
    }
}

/* python


import math

radius = float(input("Enter the circle radius: "))

area = math.pi * math.pow(radius, 2)

print("The area is: ", area)


*/

