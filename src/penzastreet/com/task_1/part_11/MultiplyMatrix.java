package penzastreet.com.task_1.part_11;

import java.util.Scanner;

public class MultiplyMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        for (int i = 0; i < n * m; i++) {
            int x = i / m, y = i % m;
            System.out.print(format(x * y));
            if (y == m - 1)
                System.out.println();
        }
    }

    public static String format(int number) {
        String str;
        if (number < 10)
            str = "   ";
        else if (number < 100)
            str = "  ";
        else if (number < 1000)
            str = " ";
        else
            str = "";
        return str + number;
    }
}
