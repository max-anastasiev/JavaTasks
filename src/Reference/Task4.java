package Reference;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a fraze: ");
        String string = reader.nextLine();
        StringBuffer newStr = new StringBuffer(string);


        for(int i = 0; i < string.length(); i++) {

            if(Character.isLowerCase(string.charAt(i))) {
                newStr.setCharAt(i, Character.toUpperCase(string.charAt(i)));
            }
            else if(Character.isUpperCase(string.charAt(i))) {
                newStr.setCharAt(i, Character.toLowerCase(string.charAt(i)));
            }
        }
        System.out.println("String after case conversion : " + newStr);
    }
}
