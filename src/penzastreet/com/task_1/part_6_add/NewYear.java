package penzastreet.com.task_1.part_6_add;

import java.util.*;

public class NewYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt(), day = in.nextInt();
        int days, res, summary;
        switch(month) {
            case 1:
                days = 31;
                summary = 0;
                break;
            case 3:
                days = 31;
                summary = 59;
                break;
            case 5:
                days = 31;
                summary = 120;
                break;
            case 7:
                days = 31;
                summary = 181;
                break;
            case 8:
                days = 31;
                summary = 212;
                break;
            case 10:
                days = 31;
                summary = 273;
                break;
            case 12:
                days = 31;
                summary = 334;
                break;
            case 2:
                days = 28;
                summary = 31;
                break;
            case 4:
                days = 30;
                summary = 90;
                break;
            case 6:
                days = 30;
                summary = 151;
                break;
            case 9:
                days = 30;
                summary = 243;
                break;
            case 11:
                days = 30;
                summary = 304;
                break;
            default:
                summary = 0;
                days = 0;
        }
        if (day < 1 || day > days) {
            res = -1;
            System.out.println(res);
            return;
        }
        res = 365 - summary - day;
        System.out.println(res);
    }
}

