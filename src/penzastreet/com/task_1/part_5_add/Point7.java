package penzastreet.com.task_1.part_5_add;

import java.util.*;

public class Point7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        String res = ((x <= 1) && (y >= 1 - x) && (x >= 0.5 || y >= 2 * x * x)? "YES" : "NO");
        System.out.println(res);
    }
}
