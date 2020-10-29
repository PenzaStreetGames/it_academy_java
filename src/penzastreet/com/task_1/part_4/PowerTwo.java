package penzastreet.com.task_1.part_4;
import java.util.*;

public class PowerTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(((n & (n - 1)) == 0) ? "YES" : "NO");
    }
}
