package penzastreet.com.task_1.part_7_add;

import java.util.*;

public class FirstNEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), a = 2;
        while(a - 2 < n * 2) {
            System.out.print(a + " ");
            a += 2;
        }
    }
}
