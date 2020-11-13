package penzastreet.com.task_1.part_6_add;

import java.util.*;

public class VeryStupidSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        if (a > b) {
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;
        }
        if (b > c) {
            b = b ^ c;
            c = b ^ c;
            b = b ^ c;
        }
        if (a > b) {
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;
        }
        System.out.println(a + " " + b + " " + c);
    }
}

