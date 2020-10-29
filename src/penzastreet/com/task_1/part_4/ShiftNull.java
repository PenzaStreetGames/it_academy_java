package penzastreet.com.task_1.part_4;
import java.util.*;

public class ShiftNull {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int shift = in.nextInt();
        System.out.println((n >> shift) << shift);
    }
}
