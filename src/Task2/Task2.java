//2) Написать программу, которая будет просить у пользователя ввести одномерный массив целочисленных значений,
// требуется вывести сумму этих элементов.

package Task2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task2 {

    public static void main(String[] args) {
        int[] array = new int[5];                       //array created
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < array.length; i++)          //filling array
            array[i] = in.nextInt();

        System.out.println(IntStream.of(array).sum());  //output the sum

    }
}

