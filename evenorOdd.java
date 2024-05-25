import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        
                //Ask for number
                Scanner read = new Scanner(System.in);
                int number;
                System.out.println("Write a number");
                number = read.nextInt();
                
                // Find out if the number above is even or odd
                if (number % 2 == 0) {
                System.out.println(number + " is even.");
                } else {
                System.out.println(number + " is odd.");
}
}
}
