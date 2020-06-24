package Reference;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {

    public static void main(String[] args) {

        //forexample
//        String string = "ae 02 eo oo ao aa aeo sdf dkfm fkfkfk og Hello there this is a simple text for this awesome code 1234567";

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a fraze: ");
        String string = reader.nextLine();

        String[] split = string.split(" ");
        Pattern pattern = Pattern.compile("[aeo]");

        for (int j = 0; j < split.length; j++){

            Matcher matcher = pattern.matcher(split[j]);
            if (matcher.find()){
                System.out.println(true + " " + split[j]);
            }
            else {
                System.out.println(false + " " + split[j]);
            }
        }

        for (int i = 0; i < split.length; i++){
            if (split[i].length() > 6){
                    System.out.println(split[i] + " this word contains more than 6 symbols");
            }
        }

        for (int k = 0; k < split.length; k++){
            if (split[k].matches(".*\\d.*")){
                System.out.println("This words contains number " + split[k]);
            };
        }
    }
}