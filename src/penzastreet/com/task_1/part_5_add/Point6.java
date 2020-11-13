package penzastreet.com.task_1.part_5_add;

import java.util.*;

public class Point6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        String res = ((x * x + y * y <= 1) && (y >= -x || y <= x)? "YES" : "NO");
        System.out.println(res);
    }
}
