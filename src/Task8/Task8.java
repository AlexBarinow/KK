//8) Написать программу, которая будет
// заполнять нулями матрицу так, чтобы она стала треугольной. Вывести её на экран.
package Task8;

import java.util.Scanner;

public class Task8 {

    static int size = 3;
    static int[][] array = new int[size][size];
    static int bound1 = 1;
    static int bound2 = 10;



    public static void main(String[] args) {

        assignArrayRandom(array,bound1, bound2);




    }

    public static int getRandomInBoundsof(int a, int b) {
        return a + (int) (Math.random() * b);
    }

    private static void assignArrayRandom(int[][] arr, int b1, int b2) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = getRandomInBoundsof(b1, b2);
    }
}
