package penzastreet.com.task_1.part_8_add_2;

import java.util.Scanner;

public class EvenIndices {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), num, amount = 0;
        for (int i = 0; i < n; i++) {
            num = in.nextInt();
            if (amount % 2 == 0)
                System.out.print(num + " ");
            amount++;
        }
    }
}
