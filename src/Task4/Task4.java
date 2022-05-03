//4) Написать программу, которая будет просить у пользователя ввести двумерный массив (матрицу),
// необходимо её транспонировать и вывести на экран.
package Task4;


import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);            //initializing block
        int[][] array = new int[3][3];


        for (int i = 0; i < array.length; i++)          //filling array
            for (int j = 0; j < array[i].length; j++)
                array[i][j] = in.nextInt();


        for (int[] iUnit : array) {                     //displaying filled double array
            for (int jUnit : iUnit)
                System.out.print(jUnit + " ");
            System.out.println();
        }

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
}
