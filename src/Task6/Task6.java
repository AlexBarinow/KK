// 6) Написать программу, которая будет просить у пользователя ввести два двумерных массив (две матрицы),
// перемножить матрицы, вывести на экран.

package Task6;


import java.util.Scanner;

public class Task6 {

    static int size = 3; // size * size matrix's size
    static int[][] firstArray = new int[size][size];
    static int[][] secondArray = new int[size][size];
    static int[][] sumArray = new int[size][size];
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {


        assignArray(firstArray);
        System.out.println();

        assignArray(secondArray);
        System.out.println();

        sumArray = multiplyArrays();
        System.out.println();

        displayArray();


    }

    private static void displayArray() {
        for (int[] iUnit : sumArray) {                  //displaying sum array
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

    private static int[][] multiplyArrays() {         //This will multiply arrays and return the sum
        int[][] sumArray = new int[size][size];
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray[i].length; j++) {
                for (int k = 0; k < size; k++) {
                    sumArray[i][j] += firstArray[i][k] * secondArray[k][j];
                }
            }
        }
        return sumArray;
    }



}

