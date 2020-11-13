package penzastreet.com.task_1.part_7;

import java.util.Scanner;

public class SmallestDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), digit, res = 10;
        while(a > 0) {
            digit = a % 10;
            if (digit < res && digit != 0)
                res = digit;
            a /= 10;
        }
        System.out.println(res);
    }
}
