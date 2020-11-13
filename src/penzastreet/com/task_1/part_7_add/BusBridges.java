package penzastreet.com.task_1.part_7_add;

import java.util.*;

public class BusBridges {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, bus = 437, h, i = 0;
        n = in.nextInt();
        while (n > i) {
            h = in.nextInt();
            if (bus >= h)
                break;
            i++;
        }
        System.out.println(n == i ? "No crash" : "Crash " + (i + 1));
    }
}
