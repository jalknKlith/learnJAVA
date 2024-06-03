/* calculate the area of a triangle,
read the base, the height and print the result */

import java.util.Scanner;

public class triangleArea {

        public static void main(String[] args) {

                float base, height, area;
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the base of the triangle");
                base = input.nextFloat();
                System.out.println("Enter the height of the triangle");
                height = input.nextFloat();
                area = base * height / 2f;
                System.out.println("The area is: "+area);


    }

}

/* python

base = float(input("Enter the base of the triangle: "));
height = float(input("Enter the height of the triangle: "));

area = (base * height) / 2

print("The area is:",area)

*/


