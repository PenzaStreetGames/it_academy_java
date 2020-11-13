package penzastreet.com.task_1.part_6_add;

import java.util.*;

public class Triangles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        String res;
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
        if (a + b <= c || a + c <= b || b + c <= a)
            res = "impossible";
        else if (a * a + b * b == c * c)
            res = "right";
        else if (a * a + b * b > c * c)
            res = "acute";
        else
            res = "obtuse";
        System.out.println(res);
    }
}
