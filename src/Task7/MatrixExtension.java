//additional matrix methods
package Task7;

import static Task7.Matrix.*;

/*1. Определитель ортогональной матрицы равен 1 или -1.
        Вывод - найти определитель матрицы

        2. её обратная матрица равна транспонированной матрице:     requirement 2
        т. е. найти и сравнить эти две матрицы.*/

public class MatrixExtension {

    private static boolean isDeterminantOrthogonal(double[][] array) {    //  bool  first requirement is matched or not
        double determinant = getDeterminant(array);
        return determinant == 1 || determinant == -1;
    }

    public static void isOrthogonal(double[][] arr) {
        if (isDeterminantOrthogonal(arr) && isTheSameMatrix(getInverse(arr), getTransposed(arr)))
            System.out.println("the matrix is orthogonal");

        else System.out.println("the matrix is not orthogonal");
    }


    private static boolean isTheSameMatrix(double[][] arr1, double[][] arr2) {

        boolean isTheSame = true;
        for (int i = 0; i < arr1.length; i++)
            for (int j = 0; j < arr1.length; j++)
                if (arr1[i][j] != arr2[i][j])
                    isTheSame = !isTheSame;


        return isTheSame;

    }


}
