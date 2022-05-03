//5) Написать программу, которая будет просить у пользователя ввести два двумерных массив (две матрицы),
// сложить две матрицы, вывести на экран.

package Task5;


import java.util.Scanner;

public class Task5 {
    static int[][] firstArray = new int[3][3];
    static int[][] secondArray = new int[3][3];
    static int[][] sumArray = new int[3][3];
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {


        assignArray(firstArray);
        System.out.println();

        assignArray(secondArray);
        System.out.println();

        sumArray = summariseArrays();
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

    private static int[][] summariseArrays() {         //This will summarise arrays and return the sum
        int[][] sumArray = new int[3][3];
        for (int i = 0; i < firstArray.length; i++)
            for (int j = 0; j < firstArray[i].length; j++)
                sumArray[i][j] = firstArray[i][j] + secondArray[i][j];
        return sumArray;
    }

}

