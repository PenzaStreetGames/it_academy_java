package penzastreet.com.task_1.part_2_add;

import java.util.*;

public class NumSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int res = a / 100 + a / 10 % 10 + a % 10;
        System.out.println(res);
    }
}
