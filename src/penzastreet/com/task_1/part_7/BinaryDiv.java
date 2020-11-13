package penzastreet.com.task_1.part_7;

import java.util.*;

public class BinaryDiv {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), i = 0;
        while(a > 0) {
            a = a >> 1;
            i++;
        }
        System.out.println(i);
    }
}
