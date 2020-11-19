package penzastreet.com.task_1.add_1;

import java.util.Scanner;

public class Euclid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), steps = 0;
        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
            steps++;
        }
        System.out.println(a + " " + (steps + 1));
    }
}
