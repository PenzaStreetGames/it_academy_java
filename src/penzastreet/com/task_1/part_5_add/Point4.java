package penzastreet.com.task_1.part_5_add;

import java.util.*;

public class Point4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        String res = ((y >= x * x - 2) && ((x >= 0 && y <= x) || (x <= 0 && y <= -x))? "YES" : "NO");
        System.out.println(res);
    }
}
