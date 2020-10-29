package penzastreet.com.task_1.part_2;
import java.util.*;

public class NextEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int res = ((a / 2) + 1) * 2;
        System.out.println(res);
    }
}

