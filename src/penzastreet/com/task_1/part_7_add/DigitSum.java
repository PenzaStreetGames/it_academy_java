package penzastreet.com.task_1.part_7_add;

import java.util.*;

public class DigitSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), res = 0;
        while(a > 0) {
            res += a % 10;
            a /= 10;
        }
        System.out.println(res);
    }
}
