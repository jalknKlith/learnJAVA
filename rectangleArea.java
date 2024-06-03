import java.util.Scanner;

public class rectangule {

        public static void main(String[] args) {

        // Ask for the values
        float length, width, area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        length = input.nextFloat();
        System.out.println("Enter the width of the rectangle");
        width = (float) input.nextFloat();

        // Calculate the area of a rectangle
        area = length * width;

        // Print variables the result
        System.out.println("The area of the rectangle is: " + area);
  }
}

/*

length = float(input("nter the length of the rectangle"))
width = float(input("nter the width of the rectangle"))
area = length * width
print("The area of the rectangle is: ", area)


*/
