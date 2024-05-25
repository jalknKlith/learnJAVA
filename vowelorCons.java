//Write to decide if it is a letter is a vowel or a consonant.

import java.util.Scanner;

public class VowelConsonant {

        public static void main(String[] args) {
                // Create a Scanner object to read user input
                Scanner input = new Scanner(System.in);

                // Prompt the user to enter a letter
                System.out.println("Enter a letter: ");
                String letter = input.nextLine();

                // Convert the letter to lowercase
                letter = letter.toLowerCase();

                // Check if the letter is a vowel
                boolean isVowel = letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u");

                // Print the result
                if (isVowel) {
                System.out.println("The letter '" + letter + "' is a vowel.");
                } else {
                System.out.println("The letter '" + letter + "' is a consonant.");
        }
    }
}



