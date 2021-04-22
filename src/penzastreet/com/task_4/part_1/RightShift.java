package penzastreet.com.task_4.part_1;

import java.util.ArrayList;
import java.util.Scanner;

public class RightShift {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            array.add(in.nextInt());
        }
        int number = array.remove(n - 1);
        array.add(0, number);
        for (int i = 0; i < n; i++) {
            System.out.print(array.get(i) + " ");
        }
    }
}
