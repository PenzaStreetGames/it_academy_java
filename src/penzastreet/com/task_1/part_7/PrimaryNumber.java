package penzastreet.com.task_1.part_7;

import java.util.Scanner;

public class PrimaryNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), i = 0, j = 0;
        boolean isPrimary = true;
        do {
            isPrimary = true;
            i = 2;
            a++;
            while (i < a) {
                if (a % i == 0) {
                    isPrimary = false;
                    break;
                }
                i++;
            }
        } while(!isPrimary);
        System.out.println(a);
    }
}
