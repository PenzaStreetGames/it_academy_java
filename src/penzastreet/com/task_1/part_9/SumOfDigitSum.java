package penzastreet.com.task_1.part_9;

import java.util.Scanner;

public class SumOfDigitSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res = 0;
        for (int i = 10; i < 100; i++) {
            if (i % 7 == 0)
                res += DigitSumFunction(i);
        }
        System.out.println(res);
    }

    public static int DigitSumFunction(int number) {
        return number / 10 + number % 10;
    }
}
