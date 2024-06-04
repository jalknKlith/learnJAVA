import java.util.Scanner;

public class VowelCons {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        String ltr = input.nextLine();

        if(ltr.equals("a") || ltr.equals("e") || ltr.equals("i")
                || ltr.equals("o") || ltr.equals("u")) {
                System.out.println(ltr + " is a vowel.");
        } else {
                System.out.println(ltr + " is a consonant.");
        }
    }
}

/* python


ltr = str(input("Enter a letter: "))

if ltr == "a" or ltr == "e" or ltr == "i" or ltr == "o" or ltr == "u":
    print(ltr, "is a vowel")
else:
    print(ltr, "is a consonant")

*/
