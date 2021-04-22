package penzastreet.com.task_4.part_1_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            array.add(in.nextInt());
        }
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int number = in.nextInt();
            int seq  = Collections.frequency(array, number);
            System.out.print(seq + " ");
        }
    }
}
