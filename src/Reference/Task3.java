package Reference;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number to determine the range of array (e.g. 2*2, 3*3, ...): ");
        int dim = reader.nextInt();

        if (dim < 2) System.out.println("Range of two-dimensional array cannot be less than 2");
        else {
            //initialization
            int[][] array = new int[dim][dim];
            for (int i = 0; i < dim; i++) {
                for (int j = 0; j < dim; j++) {
                    System.out.println("Enter the [" + i + ", " + j + "] element of array");
                    array[i][j] = reader.nextInt();
                }
            }

            //print 2d array
            for (int i = 0; i < dim; i++) {
                for (int j = 0; j < dim; j++) {
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }

            //sum of every row and col
            int sum = 0, dSum = 0, lsum = 0, rsum = 0;
            int[] colSum = new int[dim];
            int[] rowSum = new int[dim];
            int[] diagSum = new int[dim];

            for (int i = 0; i < dim; i++) {
                for (int j = 0; j < dim; j++) {
                    sum += array[i][j];
                    colSum[j] += array[i][j];
                    for (int k = 0; k < dim; k++) {
                        rowSum[k] = sum;
                    }
                }
                sum = 0;
            }

            for (int i = 0; i < dim; i++) {
                for (int j = 0; j < dim; j++) {

                    if ((dim - i - j) == 1)
                        rsum = rsum + array[i][j];

                    if (i == j)
                        lsum = lsum + array[i][j];
                }
            }

            for (int k = 0; k < dim; k++) {
                System.out.println("sum of columns " + k + " = " + colSum[k]);

            }
            for (int l = 0; l < dim; l++) {
                System.out.println("sum of rows: " + l + " = " + rowSum[l]);
            }

            System.out.println("Left Diagonal Sum= " + lsum);
            System.out.println("Right Diagonal Sum= " + rsum);

        }
    }
}