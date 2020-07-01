package JavaMustKnowStuff;

import java.util.Scanner;

public class Task2 {

    static void ValidatePassword(String string){

        String pattern = "^(?=.*[0-9])"
                + "(?=(.*\\d){2})"
                + "(?=.*[a-z])"
                + "(?=.*[A-Z].*[A-Z].*)"
                + "(?=\\S+$).{8,15}$";
        System.out.println(string.matches(pattern));

    }

    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = reader.nextLine();

        ValidatePassword(string);
    }
}
