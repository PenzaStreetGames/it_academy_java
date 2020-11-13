package penzastreet.com.task_1.part_8_add_2;

import java.util.Scanner;

import java.util.*;

public class DoubleReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), a = in.nextInt() - 1, b = in.nextInt() - 1, c = in.nextInt() - 1, d = in.nextInt() - 1;
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = i + 1;
        for (int i = 0; i < (b - a + 1) / 2; i++) {
            int index_1 = a + i, index_2 = b - i;
            array[index_1] = array[index_1] ^ array[index_2];
            array[index_2] = array[index_1] ^ array[index_2];
            array[index_1] = array[index_1] ^ array[index_2];
        }
        for (int i = 0; i < (d - c + 1) / 2; i++) {
            int index_1 = c + i, index_2 = d - i;
            array[index_1] = array[index_1] ^ array[index_2];
            array[index_2] = array[index_1] ^ array[index_2];
            array[index_1] = array[index_1] ^ array[index_2];
        }
        for (int number : array)
            System.out.print(number + " ");
    }
}
