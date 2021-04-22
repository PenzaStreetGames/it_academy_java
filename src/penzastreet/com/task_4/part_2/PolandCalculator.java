package penzastreet.com.task_4.part_2;

import java.util.Scanner;
import java.util.Stack;

public class PolandCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        String line = in.nextLine();
        int res = 0;
        for (int i = 0; i < line.length(); i += 2) {
            String symbol = line.substring(i, i + 1);
            if ("0123456789".contains(symbol)) {
                stack.push(Integer.parseInt(symbol));
            }
            else if (symbol.equals("*")) {
                int b = stack.pop(), a = stack.pop();
                stack.push(a * b);
            }
            else if (symbol.equals("+")) {
                int b = stack.pop(), a = stack.pop();
                stack.push(a + b);
            }
            else if (symbol.equals("-")) {
                int b = stack.pop(), a = stack.pop();
                stack.push(a - b);
            }
        }
        System.out.println(stack.pop());
    }
}
