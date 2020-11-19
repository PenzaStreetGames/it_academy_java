package penzastreet.com.task_1.add_1;

import java.util.Scanner;

public class LongestSegment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt(), previous = 0, sign = 1, length = 0, res = 0;
        while (number != 0) {
            if (number > previous && sign == 1 || number < previous && sign == -1) {
                length++;
            }
            else if (number > previous) {
                sign = 1;
                length = 2;
            }
            else if (number == previous) {
                sign = 0;
                length = 1;
            }
            else {
                sign = -1;
                length = 2;
            }
            if (length > res)
                res = length;
            previous = number;
            number = in.nextInt();
        }
        System.out.println(res);
    }
}
