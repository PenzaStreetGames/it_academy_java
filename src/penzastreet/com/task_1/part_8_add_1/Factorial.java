package penzastreet.com.task_1.part_8_add_1;

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), res = 1;
        for (int i = 1; i < n + 1; i++) {
            res *= i;
        }
        System.out.println(res);
    }
}
