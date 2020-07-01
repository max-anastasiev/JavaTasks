package JavaMustKnowStuff;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    static void VowelOrNotVowel(String string){


        Pattern p = Pattern.compile("[aeiouy]", Pattern.CASE_INSENSITIVE);

        int length = string.length();
        if (length % 2 == 0){

            String[] split = string.split("");
            int middleChar = split.length/2;

            String character = split[middleChar];
            String secondCharacter = split[middleChar - 1];

            Matcher matcher = p.matcher(character);
            Matcher secondMatcher = p.matcher(secondCharacter);

            if (matcher.find())
                System.out.println("[" + character + "]"  + " is vowel: ");
            else
                System.out.println("[" + character + "]" + " is not vowel");
            if (secondMatcher.find())
                System.out.println("[" + secondCharacter + "]" + " is vowel");
            else
                System.out.println("[" + secondCharacter + "]" + " is not vowel");
        }
        else if (length % 2 != 0) {

            String[] split = string.split("");
            int middleChar = split.length / 2;

            String character = split[middleChar];

            Matcher matcher = p.matcher(character);

            if (matcher.find())
                System.out.println("[" + character + "]" + " is vowel: ");
            else
                System.out.println("[" + character + "]" + " is not vowel");
        }

    }
    public static void main(String[] args) {

            Scanner reader = new Scanner(System.in);
            System.out.println("Enter a string: ");
            String string = reader.nextLine();

            if (string.length() == 0) {
                System.out.println("Your string is empty");
                System.exit(1);
            }
            VowelOrNotVowel(string);

    }
}
