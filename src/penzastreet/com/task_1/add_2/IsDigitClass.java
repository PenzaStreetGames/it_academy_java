package penzastreet.com.task_1.add_2;

import java.util.Scanner;

public class IsDigitClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char a = in.next().charAt(0);
        System.out.println((IsDigit(a) ? "yes" : "no"));
    }

    public static boolean IsDigit (char c) {
        return (c >= '0' && c <= '9');
    }
}
