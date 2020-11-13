package penzastreet.com.task_1.part_7;

import java.util.Scanner;

public class DigitalDiv {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), i = 0;
        while(a > 0) {
            a /= 10;
            i++;
        }
        System.out.println(i);
    }
}
