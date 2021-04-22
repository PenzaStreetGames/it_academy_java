package penzastreet.com.task_4.part_2;

import java.util.Scanner;
import java.util.Stack;

public class Balls {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BallStack stack = new BallStack();
        for (int i = 0; i < n; i++) {
            int color = in.nextInt();
            stack.pushBall(color);
        }
        int color = 11;
        stack.pushBall(color);
        System.out.println(stack.res);
    }


}

class BallStack {
    Stack<Ball> line = new Stack<>();
    public int res = 0;

    public void pushBall(int color) {
        if (line.empty()) {
            line.push(new Ball(color, 1));
        }
        else if (line.peek().color == color) {
            line.peek().addBall();
        }
        else {
            if (line.peek().amount > 2) {
                res += line.peek().amount;
                line.pop();
                if (line.empty()) {
                    line.push(new Ball(color, 1));
                }
                else {
                    if (line.peek().color == color)
                        line.peek().addBall();
                    else
                        line.push(new Ball(color, 1));
                }
            }
            else {
                line.push(new Ball(color, 1));
            }
        }
    }
}

class Ball {
    int color;
    int amount;

    Ball(int color, int amount) {
        this.color = color;
        this.amount = amount;
    }

    void addBall() {
        amount++;
    }
}
