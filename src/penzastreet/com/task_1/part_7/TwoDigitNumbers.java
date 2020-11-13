package penzastreet.com.task_1.part_7;

import java.util.*;

public class TwoDigitNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt(), res = 0;
        while(number > 9 && number < 100) {
            res += number / 10 + number % 10;
            number = in.nextInt();
        }
        System.out.println(res);
    }
}
