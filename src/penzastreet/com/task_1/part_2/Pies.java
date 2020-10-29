package penzastreet.com.task_1.part_2;
import java.util.*;

public class Pies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        int little_cash = b * n;
        System.out.print(a * n + little_cash / 100 + " ");
        System.out.println(little_cash % 100);
    }
}
