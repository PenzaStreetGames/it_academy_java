package penzastreet.com.task_1.part_9;

import java.util.Scanner;

public class SumOfThreeDigitSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res = 0, n = in.nextInt();
        for (int i = 100; i < n; i++) {
            if (DigitSumFunction(i) % 13 == 0)
                res++;
        }
        System.out.println(res);
    }

    public static int DigitSumFunction(int number) {
        return (number / 100) + (number / 10 % 10) + (number % 10);
    }
}
