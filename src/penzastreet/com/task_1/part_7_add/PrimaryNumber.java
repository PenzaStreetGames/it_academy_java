package penzastreet.com.task_1.part_7_add;

import java.util.Scanner;

public class PrimaryNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), i = 2;
        boolean isPrimary = true;
        if (a < 2)
            isPrimary = false;
        else {
            while (i < a) {
                if (a % i == 0) {
                    isPrimary = false;
                    break;
                }
                i++;
            }
        }
        System.out.println((isPrimary ? "prime" : "composite"));
    }
}
