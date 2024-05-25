import java.util.Scanner;

public class rectangule {

        public static void main(String[] args) {

        // Ask for the values
        float length, width, area;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        length = read.nextFloat();
        System.out.println("Enter the width of the rectangle");
        width = (float) read.nextFloat();

        // Calculate the area of a rectangle
        area = length * width;

        // Print variables the result
        System.out.println("The area of the rectangle is: " + area);
  }
}
