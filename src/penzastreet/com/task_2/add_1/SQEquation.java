package penzastreet.com.task_2.add_1;

public class SQEquation {
    private int a, b, c;

    public SQEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int val(int x) {
        return a * x * x + b * x + c;
    }
}
