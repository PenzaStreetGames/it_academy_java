package penzastreet.com.task_1.part_8;

import java.util.*;

public class OddMean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), number, amount = 0;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            number = in.nextInt();
            if (number % 2 != 0) {
                sum += number;
                amount++;
            }
        }
        System.out.println((amount > 0 ? String.format(Locale.US, "%.2f", sum / amount) : "NO"));
    }
}
