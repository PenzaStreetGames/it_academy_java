package penzastreet.com.task_1.part_2;
import java.util.*;

public class Clock {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int seconds = in.nextInt();
        int sec = seconds % 60;
        int min = seconds / 60 % 60;
        int hour = seconds / (60 * 60) % 24;
        System.out.println(hour + ":" + min / 10 + "" + min % 10 + ":" + sec / 10 + "" + sec % 10);
    }
}
