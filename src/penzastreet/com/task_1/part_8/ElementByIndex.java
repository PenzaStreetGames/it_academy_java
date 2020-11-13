package penzastreet.com.task_1.part_8;

import java.util.Scanner;

public class ElementByIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = in.nextInt();
        int value = in.nextInt();
        for (int i = 0; i < n; i++) {
            if (array[i] == value) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println("NO");
    }
}

