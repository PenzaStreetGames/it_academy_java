package penzastreet.com.task_1.part_6_add;

import java.util.*;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int res;
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                res = 31;
                break;
            case 2:
                res = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                res = 30;
                break;
            default:
                res = 0;
        }
        System.out.println(res);
    }
}
