package Task_1;

import java.util.Scanner;

public class While {

    public static void main(String args[]){

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = reader.nextInt();

        if(n >= 0){

           int i = 0;

            while (i <= n){

                if(i%2==0){
                    System.out.println(i + " even");
                    i++;
                }

                else {
                    System.out.println(i + " not even");
                    i++;
                }
            }
        }

        else {

            int i = 0;

            while (i >= n){

                if(i%2==-0){
                    System.out.println(i + " even");
                    i--;
                }

                else{
                    System.out.println(i + " not even");
                    i--;
                }
            }
        }

    }
}
