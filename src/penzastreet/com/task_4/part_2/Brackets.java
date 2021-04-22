package penzastreet.com.task_4.part_2;

import java.util.Scanner;
import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<String> brackets = new Stack<>();
        String line = in.nextLine();
        for (int i = 0; i < line.length(); i++) {
            String symbol = line.substring(i, i + 1);
            if ("([{".contains(symbol)) {
                brackets.push(symbol);
            } else if (brackets.empty()) {
                System.out.println("no");
                return;
            }
            else if (symbol.equals(")") && brackets.peek().equals("(") ||
                    symbol.equals("]") && brackets.peek().equals("[") ||
                    symbol.equals("}") && brackets.peek().equals("{")) {
                brackets.pop();
            } else {
                System.out.println("no");
                return;
            }
        }
        System.out.println((brackets.empty() ? "yes" : "no"));
    }
}
