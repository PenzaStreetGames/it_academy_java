package penzastreet.com.task_1.add_2;

import java.util.Scanner;

public class WordsNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        int words = (line.length() != 0 ? 1 : 0);
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ')
                words++;
        }
        System.out.println(words);
    }
}
