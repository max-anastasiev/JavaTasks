package Task_1;

import java.util.Scanner;

public class DoWhile {

    public static void main(String args[]){

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = reader.nextInt();
        int i = 0;

        if(n > 0){

            do{

                if(i%2==0){

                    System.out.println(i + " even");
                }

                else{

                    System.out.println(i + " not even");
                }
                i++;
            }
            while (i <= n);
        }

        if (n < 0){

            do{

                if(i%2==0){

                    System.out.println(i + " even");
                }

                else{

                    System.out.println(i + " not even");
                }
                i--;
            }
            while(i >= n);
        }

    }
}
