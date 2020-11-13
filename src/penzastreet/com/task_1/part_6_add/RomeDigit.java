package penzastreet.com.task_1.part_6_add;

import java.util.*;

public class RomeDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int third = number / 100,  second = number / 10 % 10, first = number % 10;
        String res = "";
        switch(third) {
            case 1:
                res += "C";
                break;
            case 0:
                res += "";
                break;
        }
        switch(second) {
            case 0:
                res += "";
                break;
            case 1:
                res += "X";
                break;
            case 2:
                res += "XX";
                break;
            case 3:
                res += "XXX";
                break;
            case 4:
                res += "XL";
                break;
            case 5:
                res += "L";
                break;
            case 6:
                res += "LX";
                break;
            case 7:
                res += "LXX";
                break;
            case 8:
                res += "LXXX";
                break;
            case 9:
                res += "XC";
                break;
        }
        switch (first) {
            case 0:
                res += "";
                break;
            case 1:
                res += "I";
                break;
            case 2:
                res += "II";
                break;
            case 3:
                res += "III";
                break;
            case 4:
                res += "IV";
                break;
            case 5:
                res += "V";
                break;
            case 6:
                res += "VI";
                break;
            case 7:
                res += "VII";
                break;
            case 8:
                res += "VIII";
                break;
            case 9:
                res += "IX";
                break;
        }
        System.out.println(res);
    }
}
