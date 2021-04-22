package penzastreet.com.task_4.part_1_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int number = in.nextInt();
            if (!array.contains(number))
                array.add(number);
        }
        System.out.println(array.size());
    }
}
