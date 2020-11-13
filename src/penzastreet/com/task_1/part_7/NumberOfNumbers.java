package penzastreet.com.task_1.part_7;

import java.util.*;

public class NumberOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number, i = 0;
        do {
            number = in.nextInt();
            i++;
        } while(number >= 0);
        System.out.println(i);
    }
}
