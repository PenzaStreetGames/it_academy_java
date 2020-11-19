package penzastreet.com.task_1.add_1;

import java.util.Scanner;

public class EqualsMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt(), max = number, res = 0;
        while (number != 0) {
            if (number > max) {
                max = number;
                res = 1;
            }
            else if (number == max)
                res++;
            number = in.nextInt();
        }
        System.out.println(res);
    }
}
