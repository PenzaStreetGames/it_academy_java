package penzastreet.com.task_1.part_6;

import java.util.*;

public class StupidSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        String res;
        if (a >= b && b >= c)
            res = "" + c + " " + b + " " + a;
        else if (a >= c && c >= b)
            res = "" + b + " " + c + " " + a;
        else if (b >= a && a >= c)
            res = "" + c + " " + a + " " + b;
        else if (b >= c)
            res = "" + a + " " + c + " " + b;
        else if (a >= b)
            res = "" + b + " " + a + " " + c;
        else
            res = "" + a + " " + b + " " + c;
        System.out.println(res);
    }
}