import java.util.Scanner;

public class VowelCon {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        String letter = input.nextLine();

        if(letter.equals("a") || letter.equals("e") || letter.equals("i")
                || letter.equals("o") || letter.equals("u")) {
                System.out.println(letter + " is a vowel.");
        } else {
                System.out.println(letter + " is a consonant.");
        }
    }
}

/*

letter = str(input("Enter a letter: "))

if letter == "a" or letter == "e" or letter == "i":
    print(letter, "is a vowel")
elif letter == "o" or letter == "u":
    print(letter, "is a vowel")
else:
    print(letter, "is a consonant")

*/

