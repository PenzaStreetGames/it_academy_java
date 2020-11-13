package penzastreet.com.task_1.part_6;

import java.util.*;

public class NumCategory {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        String res;
        if (number >= 0 && number <= 9)
            res = "DIGIT";
        else if (number > 9 && number < 100)
            res = "NUM";
        else
            res = "OTHER";
        System.out.println(res);
    }
}
