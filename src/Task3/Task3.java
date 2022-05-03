//3) Написать программу, которая будет просить у пользователя ввести одномерный массив типа String,
// вывести на экран элементы, если в них будет содержаться слово «программист».
package Task3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        String[] array = new String[5];              //array created
        Scanner in = new Scanner(System.in);
        String wordTocheck = "программист";

        for (int i = 0; i < array.length; i++)            //filling array
            array[i] = in.nextLine();

        for (String s : array) {
            if (String.valueOf(s).contains(wordTocheck))  //doing check
                System.out.println(s);
        }

    }
}
