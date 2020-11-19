package penzastreet.com.task_1.add_2;

import java.util.Scanner;

public class TwoEqualSymbols {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        for (int i = 0; i < line.length() - 1; i++) {
            for (int j = i + 1; j < line.length(); j++) {
                if (line.charAt(i) == line.charAt(j)) {
                    System.out.println(line.charAt(i));
                    return;
                }
            }
        }
        System.out.println("yes");
    }
}
