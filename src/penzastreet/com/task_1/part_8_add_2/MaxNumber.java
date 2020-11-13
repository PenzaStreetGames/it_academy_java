package penzastreet.com.task_1.part_8_add_2;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), num, max = in.nextInt();
        for (int i = 0; i < n - 1; i++) {
            num = in.nextInt();
            if (num > max)
                max = num;
        }
        System.out.println(max);
    }
}
