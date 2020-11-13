package penzastreet.com.task_1.part_9;

import java.util.Scanner;

public class MinShift {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = in.nextInt();
        minShift(array);
        for (int number : array)
            System.out.print(number + " ");
    }

    public static void minShift(int[] array) {
        int max = findMin(array);
        int index = findMinIndex(array, max);
        for (int i = index; i > 0; i--)
            swap(array, i, i - 1);
    }

    public static int findMin(int[] array) {
        int res = array[0];
        for (int i : array) {
            if (i < res)
                res = i;
        }
        return res;
    }

    public static int findMinIndex(int[] array, int max) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max)
                return i;
        }
        return 0;
    }

    public static void swap(int[] array, int a, int b) {
        array[a] = array[a] ^ array[b];
        array[b] = array[a] ^ array[b];
        array[a] = array[a] ^ array[b];
    }
}

