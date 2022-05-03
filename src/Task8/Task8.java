//8) Написать программу, которая будет
// заполнять нулями матрицу так, чтобы она стала треугольной. Вывести её на экран.
package Task8;

public class Task8 {

    static int size = 9;
    static int[][] array = new int[size][size];
    static int bound1 = 1;
    static int bound2 = 9;


    public static void main(String[] args) {

        assignArrayRandom(array, bound1, bound2);
        trianglise(array,true);
        displayArray(array);
        System.out.println();


        assignArrayRandom(array,bound1,bound2);
        trianglise(array, false);
        displayArray(array);


    }

    public static void trianglise(int[][] arr, boolean upperTriangle) {
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++) {
                if (upperTriangle)
                    if (j < i)
                        arr[i][j] = 0;
                if (!upperTriangle)
                    if (j > i)
                        arr[i][j] = 0;
            }
    }

    private static int getRandomInBoundsOf(int a, int b) {
        return a + (int) (Math.random() * b);
    }

    private static void displayArray(int[][] array) {
        for (int[] iUnit : array) {                  //displaying sum array
            for (int jUnit : iUnit)
                System.out.print(jUnit + " ");
            System.out.println();
        }
    }

    private static void assignArrayRandom(int[][] arr, int b1, int b2) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = getRandomInBoundsOf(b1, b2);
    }
}
