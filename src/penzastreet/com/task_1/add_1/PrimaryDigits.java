package penzastreet.com.task_1.add_1;

import java.util.Scanner;

public class PrimaryDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        boolean flag = false;
        cycle:
        for (int i = a; i <= b; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0)
                    continue cycle;
            }
            System.out.print(" " + i);
            flag = true;
        }
        System.out.println((flag ? "" : 0));
    }
}
