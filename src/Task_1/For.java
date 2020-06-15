package Task_1;

import java.util.Scanner;

public class For {

    public static void main(String args[]){

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = reader.nextInt();

        if(n >= 0) {

            for (int i = 0; i <= n; i++){

                if(i%2==0){
                    System.out.println(i + " even");
                }

                else {
                    System.out.println(i + " not even");
                }
            }

        }
        else {

            for (int i = 0; i >= n; i--){

                if(i%2==-0){
                    System.out.println(i +" even");
                }

                else {
                    System.out.println(i + " not even");
                }
            }
        }

    }
}
