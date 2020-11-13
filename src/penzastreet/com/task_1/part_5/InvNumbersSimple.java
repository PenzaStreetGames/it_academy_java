package penzastreet.com.task_1.part_5;

import java.util.*;

public class InvNumbersSimple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
        String res = ((a == -b) || (a == -c) || (a == -d) ||
                (b == -c) || (b == -d) || (c == -d) ? "true" : "false");
        System.out.println(res);
    }
}
