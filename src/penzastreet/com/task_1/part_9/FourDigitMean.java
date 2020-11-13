package penzastreet.com.task_1.part_9;

import java.util.*;

public class FourDigitMean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = in.nextInt();
        System.out.println(String.format(Locale.US, "%.2f", mean(array)));
    }

    public static double mean(int[] array) {
        int amount = 0;
        double sum = 0;
        for (int num : array) {
            if (num > 999 && num < 10000) {
                amount++;
                sum += num;
            }
        }
        return (amount != 0 ? sum / amount : -1);
    }
}
