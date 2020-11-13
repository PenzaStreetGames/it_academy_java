package penzastreet.com.task_1.part_6;

import java.util.*;

public class Cakes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cakes = in.nextInt();
        String word;
        int ending = cakes % 10;
        int second_num = cakes / 10 % 10;
        if (ending == 1 && second_num != 1)
            word = "TOPT";
        else if ((ending >= 2 && ending <= 4) && (second_num != 1))
            word = "TOPTA";
        else
            word = "TOPTOB";
        System.out.println(cakes + " " + word);
    }
}
