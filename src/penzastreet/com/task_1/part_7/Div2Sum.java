package penzastreet.com.task_1.part_7;

import java.util.*;

public class Div2Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = 26, sum = 0;
        while(b <= a) {
            sum += b;
            b += 2;
        }
        System.out.println(sum);
    }
}
