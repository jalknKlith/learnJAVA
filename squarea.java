import java.util.Scanner;

public class squarea {

        public static void main(String[] args) {
                // Ask for the side
                int side, area;
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the length of the side");
                side = input.nextInt();

                // Calculate the area of a rectangle
                area = (int) Math.pow(side, 2);

                // Print variables the result
                System.out.println("The area of the square is: " + area);
    }
}

/*
side = float(input("Enter the length of the side"))

area = side ** 2

print("The area of the square is:", area)


*/
