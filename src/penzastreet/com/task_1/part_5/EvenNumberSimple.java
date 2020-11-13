package penzastreet.com.task_1.part_5;

import java.util.*;

public class EvenNumberSimple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        String res = ((a % 2 == 0 && b % 2 == 0) ||
                (b % 2 == 0 && c % 2 == 0) ||
                (a % 2 == 0 && c % 2 == 0) ? "true" : "false");
        System.out.println(res);
    }
}
