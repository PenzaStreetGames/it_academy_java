package penzastreet.com.task_1.add_1;

import java.util.Scanner;

public class DifferentDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), digit2 = 0, digit = 0, size = sizeOf(a);
        boolean res = false;
        for (int i = 0; i < size; i++) {
            digit = getDigit(a, i + 1);
            for (int j = i + 1; j < size; j++) {
                digit2 = getDigit(a, j + 1);
                if (digit == digit2) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }

    public static int sizeOf(int number) {
        int res = 0;
        while (number > 0) {
            number /= 10;
            res++;
        }
        return res;
    }

    public static int getDigit(int number, int index) {
        return number / ((int)Math.pow(10, index - 1)) % 10;
    }
}
