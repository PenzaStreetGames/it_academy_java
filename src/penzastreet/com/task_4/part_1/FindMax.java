package penzastreet.com.task_4.part_1;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = in.nextInt(), number;
        for (int i = 0; i < n - 1; i++) {
            number = in.nextInt();
            if (number > max)
                max = number;
        }
        System.out.println(max);
    }
}
