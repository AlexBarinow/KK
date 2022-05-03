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

        int[][] arrayNew = new int[3][3];               //new array which is going to be transposed

        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
                arrayNew[j][i] = array[i][j];


        System.out.println();


        for (int[] iUnit : arrayNew) {                  //displaying transposed double array
            for (int jUnit : iUnit)
                System.out.print(jUnit + " ");
            System.out.println();
        }


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
}
