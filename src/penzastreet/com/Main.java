package penzastreet.com;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Nikolaevich!");
        add();
    }

    public static void add() {
        Scanner in = new Scanner(System.in);
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        int c = a + b;
        System.out.println(c);
    }
}

