import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Write your age");
            int age = scan.nextInt();

            int votingAge = 18;

            if (age >= votingAge) {
                System.out.println("Old enough to vote!");
            } else {
                System.out.println("Not old enough to vote.");
            }

        }
    }
}
