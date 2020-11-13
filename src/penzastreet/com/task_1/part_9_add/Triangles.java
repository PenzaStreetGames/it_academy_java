package penzastreet.com.task_1.part_9_add;

import java.util.*;

public class Triangles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1 = in.nextDouble(), y1 = in.nextDouble(), x2 = in.nextDouble();
        double y2 = in.nextDouble(), x3 = in.nextDouble(), y3 = in.nextDouble();
        double perimeter = length(x1, y1, x2, y2) + length(x2, y2, x3, y3) + length(x1, y1, x3, y3);
        System.out.printf(Locale.US, "%.10f%n", perimeter);
    }

    public static double length(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }
}
