package penzastreet.com.task_1.part_6_add;

import java.util.*;

public class MaxNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        int res;
        if (a >= b && a >= c)
            res = a;
        else if (b >= a && b >= c)
            res = b;
        else
            res = c;
        System.out.println(res);
    }
}

