//9) Финальная задача. Задача со звёздочкой.
// Попробовать догадаться, как можно вывести на экран все матрицы (двумерные массивы) с помощью цикла foreach.
package Task9;

public class Task9 {

    static int size = 9;
    static int[][] array = new int[size][size];
    static int bound1 = 1;
    static int bound2 = 9;


    public static void main(String[] args) {

        assignArrayRandom(array, bound1, bound2);
        displayArrayForEach(array);

    }


    private static void displayArrayForEach(int[][] array) {
        for (int[] iUnit : array) {
            for (int jUnit : iUnit)
                System.out.print(jUnit + " ");
            System.out.println();
        }
    }

    private static void assignArrayRandom(int[][] arr, int b1, int b2) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = b1 + (int) (Math.random() * b2);
    }
}
