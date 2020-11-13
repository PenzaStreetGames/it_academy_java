package penzastreet.com.task_1.part_7_add;

import java.util.Scanner;

public class StupidMultiply {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), res = 0;
        int abs_a = Math.abs(a), abs_b = Math.abs(b), i = 0;
        while(i != abs_b) {
            res += abs_a;
            i++;
        }
        if ((a < 0 && b > 0 || a > 0 && b < 0) && res != 0)
            System.out.print("-");
        System.out.println(res);
    }
}
