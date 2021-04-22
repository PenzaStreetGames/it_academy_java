package penzastreet.com.task_4.part_2;

import java.util.Scanner;
import java.util.Stack;

public class WorkingStack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String command = in.next();
        StackClass stack = new StackClass();
        while (!command.equals("exit")) {
            if (command.equals("push")) {
                int n = in.nextInt();
                stack.push(n);
                System.out.println("ok");
            }
            else if (command.equals("back")) {
                System.out.println(stack.back());
            }
            else if (command.equals("pop")) {
                System.out.println(stack.pop());
            }
            else if (command.equals("size")) {
                System.out.println(stack.size());
            }
            else if (command.equals("clear")) {
                stack.clear();
                System.out.println("ok");
            }
            command = in.next();
        }
        System.out.println("bye");
    }
}

class StackClass {
    Stack<Integer> stack = new Stack<>();

    public void push(int n) {
        stack.push(n);
    }

    public int pop() {
        return stack.pop();
    }

    public int back() {
        return stack.peek();
    }

    public int size() {
        return stack.size();
    }

    public void clear() {
        stack.clear();
    }
}
