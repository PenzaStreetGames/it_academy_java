package penzastreet.com.task_1.part_5_add;

import java.util.*;

public class Point3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        String res = ((y <= 2 - x * x) && ((x >= 0 && y >= 0) || (x <= 0 && y >= x))? "YES" : "NO");
        System.out.println(res);
    }
}
