package penzastreet.com.task_1.part_5_add;

import java.util.*;

public class Point2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        String res = ((y >= 0) && (y <= 0.5) && (x >= 0) &&
                (x <= Math.PI) && (y <= Math.sin(x))? "YES" : "NO");
        System.out.println(res);
    }
}
