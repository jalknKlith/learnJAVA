mport java.util.Scanner;

public class numerology {    

        public static void main(String[] args) {
                
                Scanner sc = new Scanner(System.in);
                
                // Get the date of birth from the user.
                System.out.println("Enter your date of birth (YYYYMMDD): ");
                String dob = sc.nextLine();
                
                // Add the digits of the date of birth together.
                int sum = 0;
                for (int i = 0; i < dob.length(); i++) {
                sum += Integer.parseInt(dob.substring(i, i + 1));
                }
                
                /*Keep adding the digits of the sum
                together until we get a number between 1 and 9.*/
                while (sum > 9) {
                String newSum = Integer.toString(sum);
                sum = 0;
                for (int i = 0; i < newSum.length(); i++) {
                sum += Integer.parseInt(newSum.substring(i, i + 1));
                }
                }
                
                // Print the final sum.
                System.out.println("Your are a number " + sum);
    }
}
