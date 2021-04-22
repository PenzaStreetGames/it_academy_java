package penzastreet.com.task_4.part_1;

import java.util.Scanner;

public class PreviousBigger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res = 0, prev, number = in.nextInt();
        for (int i = 0; i < n - 1; i++) {
            prev = number;
            number = in.nextInt();
            if (number > prev)
                res++;
        }
        System.out.println(res);
    }
}
