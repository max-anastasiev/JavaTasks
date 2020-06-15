package Task_3;

import java.util.Scanner;

public class SwitchWithPlaces {

    public static void main(String args[]){

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter i: ");
        int i = reader.nextInt();

//        Scanner readerj = new Scanner(System.in);
//        System.out.println("Enter j: ");
        int j = reader.nextInt();

//        Alternative
//        i = i + j - (j = i);

        int temp;

        temp = i;
        i = j;
        j = temp;

        System.out.println("i= " + i );
        System.out.println("j= " + j);

    }

}
