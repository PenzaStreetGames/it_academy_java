package penzastreet.com.task_1.add_1;

import java.util.Scanner;

public class Mastic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), n = in.nextInt(), res = 0;
        for (int i = 0; i <= n / a; i++) {
            for (int j = 0; j <= (n - a * i) / b; j++) {
                for (int k = 0; k <= (n - a * i - b * j) / c; k++) {
                    if (a * i + b * j + c * k == n) {
                        res++;
                    }
                }
            }
        }
        System.out.println(res);
        for (int i = 0; i <= n / a; i++) {
            for (int j = 0; j <= (n - a * i) / b; j++) {
                for (int k = 0; k <= (n - a * i - b * j) / c; k++) {
                    if (a * i + b * j + c * k == n) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
    }
}
