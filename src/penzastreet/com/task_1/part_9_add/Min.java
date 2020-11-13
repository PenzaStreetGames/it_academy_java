package penzastreet.com.task_1.part_9_add;

import java.util.*;

public class Min {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
        System.out.println(min(a, b, c, d));
    }

    public static int min(int a, int b, int c, int d) {
        int[] array = {a, b, c, d};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    array[i] ^= array[j];
                    array[j] ^= array[i];
                    array[i] ^= array[j];
                }
            }
        }
        return array[0];
    }
}
