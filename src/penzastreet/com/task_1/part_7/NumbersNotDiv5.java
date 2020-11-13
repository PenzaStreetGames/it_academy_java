package penzastreet.com.task_1.part_7;

import java.util.*;

public class NumbersNotDiv5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number, res = 0;
        do {
            number = in.nextInt();
            if (number > 10)
                res += number;
        } while(number % 5 != 0);
        System.out.println(res);
    }
}
