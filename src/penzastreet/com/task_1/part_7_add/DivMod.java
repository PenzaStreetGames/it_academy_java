package penzastreet.com.task_1.part_7_add;

import java.util.*;

public class DivMod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        int c = in.nextInt(), d = in.nextInt();
        int number = 10000;
        boolean any = false;
        while (number < 100000) {
            if ((number % a == b) && (number % c == d)) {
                System.out.print(number + " ");
                any = true;
            }
            number++;
        }
        if (!any)
            System.out.println(-1);
    }
}
