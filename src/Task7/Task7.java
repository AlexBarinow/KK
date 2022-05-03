// 7) Написать программу, которая будет просить у пользователя ввести двумерный массив (матрицу),
// проверить её на ортогональность, вывести ответ пользователю.
package Task7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task7 {

    static int size = 3; // size * size matrix's size
    static double[][] array = new double[size][size];
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        assignArray(array);

        System.out.println();
        System.out.println();

        System.out.println(getDeterminant(array));
        System.out.println(isDeterminantOrthogonal(array));


    }

    public static double getDeterminant(double[][] A) {
        DecimalFormat df = new DecimalFormat("###.##");
        double determinant = 1, tmp;
        for (int i = 0, index = 0; i < A.length; index = ++i) {
            for (int j = i + 1; j < A.length; ++j)
                if (Math.abs(A[j][i]) > Math.abs(A[index][i]))
                    index = j;
            if (Math.abs(A[index][i]) <= 0.0) return 0.;
            if (index != i) determinant *= -1;
            for (int j = i; j < A.length; ++j) {
                tmp = A[index][j];
                A[index][j] = A[i][j];
                A[i][j] = tmp;
            }
            for (int j = i + 1; j < A.length; ++j) {
                tmp = A[j][i] / A[i][i];
                for (int k = i; k < A.length; ++k)
                    A[j][k] -= tmp * A[i][k];
            }
            determinant *= A[i][i];
        }

        return Double.parseDouble(df.format(determinant));
    }

    private static void displayArray(int[][] array) {
        for (int[] iUnit : array) {                  //displaying sum array
            for (int jUnit : iUnit)
                System.out.print(jUnit + " ");
            System.out.println();
        }
    }

    private static void assignArray(double[][] array) {          // This will allow to avoid duplicating the same code twice as we have two arrays
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
                array[i][j] = in.nextInt();
    }

    private static boolean isDeterminantOrthogonal(double[][] array) {
        double determinant = getDeterminant(array);
        return determinant == 1 || determinant == -1;
    }

    private static double[][] getTransposed(double[][] array){





        return
    }
}

