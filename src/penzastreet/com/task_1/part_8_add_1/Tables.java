package penzastreet.com.task_1.part_8_add_1;

import java.util.*;

public class Tables {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print((1 + i * (n + 1)) + " ");
        }
    }
}
