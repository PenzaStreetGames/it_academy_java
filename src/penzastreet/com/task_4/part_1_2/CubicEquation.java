package penzastreet.com.task_4.part_1_2;

import java.util.ArrayList;
import java.util.Scanner;

public class CubicEquation {
    static int a, b, c, d;
    static int range = 1000;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        double pos = -range;
        double prev = eval(pos);
        pos++;
        double now = eval(pos);
        while (prev > 0 && now > 0 || prev < 0 && now < 0) {
            prev = now;
            pos++;
            now = eval(pos);
        }
        double low = pos - 1, high = pos;
        double mid = (low + high) / 2;
        double value = eval(mid);
        while (Math.abs(value) > 1e-10) {
            if (value > 0 && now > 0 || value < 0 && now < 0) {
                high = mid;
            }
            else if (value < 0 && prev < 0 || value > 0 && prev > 0) {
                low = mid;
            }
            else {
                high = mid;
            }
            mid = (low + high) / 2;
            value = eval(mid);
            prev = eval(low);
            now = eval(high);
        }
        System.out.println(mid);
    }

    static double eval(double x) {
        return a * x * x * x + b * x * x + c * x + d;
    }
}
