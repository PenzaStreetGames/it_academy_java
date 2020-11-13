package penzastreet.com.task_1.part_8;

import java.util.Scanner;

public class NegativeSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), neg = 0;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
            if (array[i] < 0) {
                for (int j = i; j > neg; j--) {
                    array[j] = array[j] ^ array[j - 1];
                    array[j - 1] = array[j] ^ array[j - 1];
                    array[j] = array[j] ^ array[j - 1];
                }
                neg++;
            }
        }
        for (int num : array)
            System.out.print(num + " ");
    }
}
