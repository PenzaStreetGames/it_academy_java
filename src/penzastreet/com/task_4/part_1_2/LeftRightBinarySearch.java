package penzastreet.com.task_4.part_1_2;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRightBinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int number = in.nextInt();
            int index  = Arrays.binarySearch(array, number);
            int left = index, right = index;
            if (index >= 0) {
                while (left > 0 && array[left - 1] == number)
                    left--;
                System.out.print(left + 1 + " ");
                while (right < n - 1 && array[right + 1] == number)
                    right++;
                System.out.println(right + 1);
            }
            else
                System.out.println(0);
        }
    }
}
