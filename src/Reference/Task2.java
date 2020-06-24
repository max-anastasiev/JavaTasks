package Reference;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter dimension of array: ");
        int dim = reader.nextInt();

        int[] array = new int[dim];

        for (int i = 0; i < dim; i++){
            System.out.println("Enter " + i + " element");
            array[i] = reader.nextInt();
        }
        for (int i = 0; i < dim; i++){
            for (int j = i + 1; j < dim - 1; j++){
                if (array[i] == array[j]){
                    System.out.println("This values are duplicated in array\n" + array[i]);
                }
            }
        }
    }
}
