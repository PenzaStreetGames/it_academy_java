package penzastreet.com.task_1.add_2;

import java.util.Scanner;

public class SpaceSplit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine().replaceAll("\\s+", " ");
        System.out.println(line);
    }
}
