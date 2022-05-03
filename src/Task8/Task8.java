package Task8;

import java.util.Scanner;

public class Task8 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

    }

    private static void assignArray(double[][] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = in.nextDouble();
    }
}
