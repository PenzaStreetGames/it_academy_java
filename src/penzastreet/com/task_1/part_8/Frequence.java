package penzastreet.com.task_1.part_8;

import java.util.Scanner;

public class Frequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), value = 0, max = 0, amount;
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = in.nextInt();
        for (int i = 0; i < n; i++) {
            amount = 1;
            for (int j = 0; j < n; j++) {
                if (array[i] == array[j])
                    amount++;
                if (amount > max) {
                    max = amount;
                    value = array[i];
                }
            }
        }
        System.out.println(value);
    }
}
