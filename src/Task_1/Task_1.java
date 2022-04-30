package Task_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        float array[] = new float[5];
        Scanner in = new Scanner(System.in);

        for(int i = 1; i <= array.length;i++)
            array[array.length - i] = in.nextFloat();


        for (int i = 0; i <= array.length; i++)
            System.out.println(array[i]);
    }
}
