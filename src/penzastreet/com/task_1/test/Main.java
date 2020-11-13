package penzastreet.com.task_1.test;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, number, zeros = 0;
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            number = in.nextInt();
            if (number == 0)
                zeros++;
            else {
                System.out.print(number + " ");
            }
        }
        for (int i = 0; i < zeros; i++)
            System.out.print("0 ");
    }
}
