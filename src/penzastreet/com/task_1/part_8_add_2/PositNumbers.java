package penzastreet.com.task_1.part_8_add_2;

import java.util.Scanner;

public class PositNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), num, posit = 0;
        for (int i = 0; i < n; i++) {
            num = in.nextInt();
            if (num > 0)
                posit++;
        }
        System.out.println(posit);
    }
}
