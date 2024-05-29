import java.util.Scanner;

public class StarSign {

        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                // Get the user's birth month and day
                System.out.print("Enter your birth month (1-12): ");
                int month = input.nextInt();

                System.out.print("Enter your birth day (1-31): ");
                int day = input.nextInt();

                // Determine the star sign based on the birth month and day
                String starSign = "";

                //January
                if (month == 1) {
                        if (day >= 20) {
                                starSign = "Aquarius";
                        } else {
                                starSign = "Capricorn";
                }
                //February
                } else if (month == 2) {
                        if (day >= 19) {
                                starSign = "Pisces";
                        } else {
                                starSign = "Aquarius";
                }
                //March
                } else if (month == 3) {
                        if (day >= 21) {
                                starSign = "Aries";
                        } else {
                                starSign = "Pisces";
                }
                //April
                } else if (month == 4) {
                if (day >= 20) {
                        starSign = "Taurus";
                } else {
                        starSign = "Aries";
                }
                //May
                } else if (month == 5) {
                if (day >= 21) {
                        starSign = "Gemini";
                } else {
                        starSign = "Taurus";
                }
                //June
                } else if (month == 6) {
                if (day >= 21) {
                        starSign = "Cancer";
                } else {
                        starSign = "Gemini";
                }
                //July
                } else if (month == 7) {
                if (day >= 23) {
                        starSign = "Leo";
                } else {
                        starSign = "Cancer";
                }
                //August
                } else if (month == 8) {
                if (day >= 23) {
                        starSign = "Virgo";
                } else {
                        starSign = "Leo";
                }
                //September
                } else if (month == 9) {
                if (day >= 23) {
                        starSign = "Libra";
                } else {
                        starSign = "Virgo";
                }
                //October
                } else if (month == 10) {
                if (day >= 23) {
                        starSign = "Scorpio";
                } else {
                        starSign = "Libra";
                }
                //November
                } else if (month == 11) {
                if (day >= 22) {
                        starSign = "Sagittarius";
                } else {
                        starSign = "Scorpio";
                }
                //December
                } else if (month == 12) {
                if (day >= 22) {
                        starSign = "Capricorn";
                } else {
                        starSign = "Sagittarius";
                }
                }

                // Print the star sign
                System.out.println("Your star sign is: " + starSign);
    }
}
