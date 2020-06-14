package Task_3;

import java.util.Scanner;

public class Switch_with_places {

    public static void main(String args[]){

        Scanner readeri = new Scanner(System.in);
        System.out.println("Enter i: ");
        int i = readeri.nextInt();

        Scanner readerj = new Scanner(System.in);
        System.out.println("Enter j: ");
        int j = readerj.nextInt();

        int temp;

        temp = i;
        i = j;
        j = temp;

        System.out.println("i= " + i );
        System.out.println("j= " + j);

    }

}
