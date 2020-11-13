package penzastreet.com.task_1.part_8_add_2;

import java.util.Scanner;

public class BiggerNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), num, last = in.nextInt(), res = 0;
        for (int i = 0; i < n - 1; i++) {
            num = in.nextInt();
            if (num > last)
                res++;
            last = num;
        }
        System.out.println(res);
    }
}
