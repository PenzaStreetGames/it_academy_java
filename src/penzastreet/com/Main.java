package penzastreet.com;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(12.75 % 5);
    }

    public static void add() {
        Scanner in = new Scanner(System.in);
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        int c = a + b;
        System.out.println(c);
    }

    public static void abc() {
        int a = 5, b, c;
        b = a++;
        c = ++a;
        System.out.println(a + "\n" + b + "\n" + c);
    }

    public static void weights() {
        int N, res = 0;
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        while (N > 0) {
            N >>= 1;
            res++;
        }
        System.out.println(res - 1);
    }
}

