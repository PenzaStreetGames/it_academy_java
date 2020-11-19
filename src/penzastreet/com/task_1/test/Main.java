package penzastreet.com.task_1.test;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), min = 10001;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if (a[i] < min)
                min = a[i];
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == min)
                System.out.print((i + 1) + " ");
        }
    }
}
