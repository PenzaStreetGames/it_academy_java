package penzastreet.com.task_1.part_5;

import java.util.*;

public class NoTwoSegments {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        String res = ((x < -2) || (3 < x && x < 6) || (9 < x) ? "true" : "false");
        System.out.println(res);
    }
}
