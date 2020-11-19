package penzastreet.com.task_1.add_2;

import java.util.Scanner;

public class RegisterChange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char a = in.next().charAt(0);
        System.out.println(changeRegister(a));
    }

    public static char changeRegister (char c) {
        if (c >= 'a' && c <= 'z')
            c = (char)(c - 'a' + 'A');
        else if (c >= 'A' && c <= 'Z')
            c = (char)(c - 'A' + 'a');
        return c;
    }
}
