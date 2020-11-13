package penzastreet.com.task_1.part_8_add_1;

import java.util.*;

public class Cards {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), card;
        int sum = (n + 1) * (n) / 2;
        for (int i = 0; i < n - 1; i++) {
            card = in.nextInt();
            sum -= card;
        }
        System.out.println(sum);
    }
}
