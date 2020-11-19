package penzastreet.com.task_1.add_2;

import java.util.Scanner;

public class PalindromeToo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine().replaceAll("\\s", "");
        for (int i = 0; i <= line.length() / 2; i++) {
            if (line.charAt(i) != line.charAt(line.length() - i - 1)) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}
