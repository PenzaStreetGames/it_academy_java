package penzastreet.com.task_1.part_11;

import java.util.Scanner;

public class SnakeMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(format((i % 2 == 0 ? i * m + j : (i + 1) * m - j - 1)));
            }
            System.out.println();
        }
    }

    public static String format(int number) {
        String str;
        if (number < 10)
            str = "  ";
        else if (number < 100)
            str = " ";
        else
            str = "";
        return str + number;
    }
}
