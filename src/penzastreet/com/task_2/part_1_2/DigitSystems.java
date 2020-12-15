package penzastreet.com.task_2.part_1_2;

import java.util.Scanner;

public class DigitSystems {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(Integer.toString(number, 2));
        System.out.println(Integer.toString(number, 8));
        System.out.println(Integer.toString(number, 16));
        System.out.println((((short)number) == number) ? "YES" : "NO");
        System.out.println((((byte)number) == number) ? "YES" : "NO");
    }
}
