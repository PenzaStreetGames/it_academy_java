package penzastreet.com.task_1.part_8;

import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), sum = 0, number, amount = 0;
        for (int i = 0; i < n; i++) {
            number = in.nextInt();
            if (number % 2 == 0) {
                sum += number;
                amount++;
            }
        }
        System.out.println((amount > 0 ? sum : "NO"));
    }
}
