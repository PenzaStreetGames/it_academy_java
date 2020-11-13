package penzastreet.com.task_1.part_9;

import java.util.*;

public class BinaryFraction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        DigitSumFunction(in.nextDouble(), in.nextInt());
    }

    public static void DigitSumFunction(double fraction, int num) {
        for (int i = 0; i < num; i++) {
            fraction *= 2;
            System.out.print((int)fraction);
            fraction -= (int)fraction;
        }
    }
}
