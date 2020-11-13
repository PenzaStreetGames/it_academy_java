package penzastreet.com.task_1.part_9;

import java.util.*;

public class DigitSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(DigitSumFunction(in.nextInt()));
    }

    public static int DigitSumFunction(int number) {
        return number / 10 + number % 10;
    }
}
