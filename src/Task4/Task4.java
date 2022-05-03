//4) Написать программу, которая будет просить у пользователя ввести двумерный массив (матрицу),
// необходимо её транспонировать и вывести на экран.
package Task4;


import java.util.Scanner;

public class Task4 {

    static Scanner in = new Scanner(System.in);            //initializing block
    static int[][] array = new int[3][3];

    public static void main(String[] args) {

        assignArray(array);
        displayArray(array);
        int[][] arrayNew = getTransposed(array);  //new array which is going to be transposed
        System.out.println();
        displayArray(arrayNew);

    }

    private static void displayArray(int[][] arr) {
        for (int[] iUnit : arr) {                  //displaying sum array
            for (int jUnit : iUnit)
                System.out.print(jUnit + " ");
            System.out.println();
        }
    }

    private static void assignArray(int[][] array) {          // This will allow to avoid duplicating the same code twice as we have two arrays
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
                array[i][j] = in.nextInt();
    }

    public static int[][] getTransposed(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                transpose[j][i] = matrix[i][j];
        return transpose;
    }
}
