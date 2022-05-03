// 7) Написать программу, которая будет просить у пользователя ввести двумерный массив (матрицу),
// проверить её на ортогональность, вывести ответ пользователю.
package Task7;

import java.util.Scanner;
import static Task7.MatrixExtension.isOrthogonal;

public class Task7 {
    static int size = 3;
    static double[][] array = new double[size][size];
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        assignArray(array);
        isOrthogonal(array);

    }

    private static void assignArray(double[][] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = in.nextDouble();
    }


}

