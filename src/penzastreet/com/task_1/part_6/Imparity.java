package penzastreet.com.task_1.part_6;

import java.util.*;

public class Imparity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double a = in.nextInt(), b = in.nextInt();
        String res;
        if (a == 0) {
            if (b > 0)
                res = "any x";
            else
                res = "no such x";
        }
        else if (a > 0) {
            String mba = String.format(Locale.US, "%.1f", -(b / a));
            String ba = String.format(Locale.US, "%.1f", (b / a));
            if (b > 0)
                res = "any x";
            else
                res = "x<" + ba + " or x>" + mba;
        }
        else {
            String mba = String.format(Locale.US, "%.1f", -(b / a));
            String ba = String.format(Locale.US, "%.1f", (b / a));
            if (b < 0)
                res = "no such x";
            else
                res = ba + "<x<" + mba;
        }
        System.out.println(res);
    }
}

