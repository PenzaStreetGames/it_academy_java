package penzastreet.com.task_1.part_4;
import java.util.*;

public class OlderNull {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int mask = in.nextInt();
        System.out.println(number & ((1 << mask) - 1));
    }
}
