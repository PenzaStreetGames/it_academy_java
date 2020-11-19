package penzastreet.com.task_1.part_7_add;

import java.util.*;

public class DigitsNear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), lastNum = 10, digit = 0;
        boolean res = false;
        while(a > 0) {
            digit = a % 10;
            if (digit == lastNum) {
                res = true;
                break;
            }
            lastNum = digit;
            a /= 10;
        }
        System.out.println((res ? "YES" : "NO"));
    }
}
