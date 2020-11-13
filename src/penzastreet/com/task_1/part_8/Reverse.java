package penzastreet.com.task_1.part_8;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = in.nextInt();
        for (int i = 0; i < n / 2; i++) {
            array[i] = array[i] ^ array[n - i - 1];
            array[n - i - 1] = array[i] ^ array[n - i - 1];
            array[i] = array[i] ^ array[n - i - 1];
        }
        for (int number : array)
            System.out.print(number + " ");
    }
}
