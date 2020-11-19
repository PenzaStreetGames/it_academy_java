package penzastreet.com.task_1.add_2;

import java.util.Scanner;

public class CryptoCaesar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        int shift = in.nextInt();
        for (int i = 0; i < line.length(); i++) {
            char out = (char) ((char)((int)((line.charAt(i) - 'A') - shift + 26) % 26) + 'A');
            System.out.print(out);
        }
    }
}
