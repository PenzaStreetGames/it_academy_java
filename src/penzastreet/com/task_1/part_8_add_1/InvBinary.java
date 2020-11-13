package penzastreet.com.task_1.part_8_add_1;

import java.util.*;

public class InvBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt(), size = 0;
        while (number >> size > 0)
            size++;
        for (int i = 0; i < size; i++) {
            System.out.print(number % 2);
            number /= 2;
        }
    }
}
