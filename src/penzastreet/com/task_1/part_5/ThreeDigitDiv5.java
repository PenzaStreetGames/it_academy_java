package penzastreet.com.task_1.part_5;

import java.util.*;

public class ThreeDigitDiv5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        String res = ((1000 > x) && (x >= 100) && (x % 5 == 0) ? "true" : "false");
        System.out.println(res);
    }
}
