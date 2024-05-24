/* calculate the area of a triangle, read the base,
the height and print the result */

import java.util.Scanner; 

public class triangleArea {

    public static void main(String[] args) {
        
        float base, height, area;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the base of the triangle");
        base = read.nextFloat(); //implicit conversion
        System.out.println("Enter the height of the triangle");
        height = (float) read.nextFloat(); //explicit conversion
        area = base * height / 2f;
        System.out.println("The area is: "+area);


    }

}
