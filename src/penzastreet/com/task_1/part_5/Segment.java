package penzastreet.com.task_1.part_5;
import java.util.*;

public class Segment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        String res = (3 <= x & x <= 8 ? "true" : "false");
        System.out.println(res);
    }
}
