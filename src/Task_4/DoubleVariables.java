package Task_4;

import java.util.Scanner;

public class DoubleVariables {

    public static void main(String args[]){

        Scanner reader1 = new Scanner(System.in);
        System.out.println("Enter number with decimals: ");
        double i = reader1.nextDouble();

        Scanner reader2 = new Scanner(System.in);
        System.out.println("Enter number with decimals: ");
        double j = reader2.nextDouble();

        System.out.println("Addition i + j = " + (i + j));
        System.out.println("Subtraction i - j = " + (i - j) + "\nSubtraction j - i = " + (j - i));
        System.out.println("Multiplication i * j = " + (i * j));
        System.out.println("Division i / j = " + (i / j) + "\nDivision j / i = " + (j / i));

    }
}
