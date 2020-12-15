package penzastreet.com.task_2.add_1;

class Rectangle {
    private int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getP() {
        return 2 * (a + b);
    }

    public int getS() {
        return a * b;
    }
}

