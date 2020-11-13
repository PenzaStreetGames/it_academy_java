package penzastreet.com.task_1.part_7;

import java.util.*;

public class StupidDiv {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), res = 0;
        while(a >= b) {
            a -= b;
            res++;
        }
        System.out.println(res + " " + a);
    }
}