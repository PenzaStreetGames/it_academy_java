package penzastreet.com.task_1.part_8;

import java.util.Scanner;

public class Progression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = 4 + 3 * i;
        for (int a: array)
            System.out.print(a + " ");
    }
}
