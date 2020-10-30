package penzastreet.com.task_1.part_5;
import java.util.*;

public class TwoSegments {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        String res = ((-3 <= x && x <= 5) || (9 <= x && x <= 15) ? "true" : "false");
        System.out.println(res);
    }
}
