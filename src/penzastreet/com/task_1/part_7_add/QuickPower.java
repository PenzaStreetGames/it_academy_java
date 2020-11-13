package penzastreet.com.task_1.part_7_add;

import java.util.Scanner;

public class QuickPower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble(), res = 1;
        int n = in.nextInt();
        if (n < 0) {
            a = 1 / a;
            n = -n;
        }
        while (n > 1) {
            if (n % 2 == 0) {
                a = a * a;
                n /= 2;
            } else {
                res *= a;
                n--;
            }
        }
        if (n == 0)
            a = 1;
        System.out.println(res * a);
    }
}
