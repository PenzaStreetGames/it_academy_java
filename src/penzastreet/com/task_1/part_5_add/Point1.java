package penzastreet.com.task_1.part_5_add;

import java.util.*;

public class Point1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        String res = ((x * x + y * y >= 4) && (x <= 2) &&
                (x >= y) && (x >= 0) && (y >= 0)? "YES" : "NO");
        System.out.println(res);
    }
}
