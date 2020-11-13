package penzastreet.com.task_1.part_7;

import java.util.Scanner;

public class LastOddDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), digit = 0;
        while(a > 0) {
            digit = a % 10;
            if (digit % 2 == 1)
                break;
            a /= 10;
        }
        System.out.println((digit % 2 != 0 ? digit : "NO"));
    }
}
