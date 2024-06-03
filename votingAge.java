import java.util.Scanner;

public class votingAge {

        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.println("Enter your age");
                int age = input.nextInt();

                if (age >= 18) {
                        System.out.println("Old enough to vote!");
                } else {
                        System.out.println("Not old enough to vote.");
        }
    }
}

/*

age = int(input("Enter your age"))

if age >= 18:
        print("Old enough to vote!")
else:
        print("Not old enough to vote.")

*/
