package penzastreet.com.task_1.part_4;
import java.util.*;

public class BitToOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int shift = in.nextInt();
        System.out.println(number | (1 << shift));
    }
}
