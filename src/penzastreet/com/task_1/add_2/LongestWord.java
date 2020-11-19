package penzastreet.com.task_1.add_2;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        int length = 0, max_length = 0, max_index = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) != ' ') {
                length++;
                if (length > max_length) {
                    max_length = length;
                    max_index = i - length + 1;
                }
            }
            else
                length = 0;
        }
        System.out.println(line.substring(max_index, max_index + max_length));
        System.out.println(max_length);
    }
}
