package penzastreet.com.task_1.part_5_add;

import java.util.*;

public class Point8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        String res = ((y <= 1) && (x >= 0) &&
                ((y >= x - 1) || (x <= 0.5 && x * x + y * y <= 1))? "YES" : "NO");
        System.out.println(res);
    }
}
