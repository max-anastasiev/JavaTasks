package Reference;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter dimension of array: ");
        int dim = reader.nextInt();

        int[] array = new int[dim];

        for (int i = 0; i < dim; i++){
            System.out.println("Enter " + i + " element");
            array[i] = reader.nextInt();
        }

        int[] revarray = new int[dim];

        for (int i = 0; i < dim; i++){
            revarray[i] = array[dim - i - 1];
        }

        System.out.print("Array before inverse \n" + Arrays.toString(array) + "\n\n");

        for (int i = 0; i < dim; i++){
            array[i] = revarray[i];
        }

        System.out.print("Array after inverse \n" + Arrays.toString(array));

        reader.close();

    }
}