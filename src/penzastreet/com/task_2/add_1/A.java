package penzastreet.com.task_2.add_1;

class A {
    private B b;

    public A() {
        System.out.print("AB");
        b = new B();
    }

    public A(int i) {
        b = new B(i);
        System.out.print("Ai");
    }

    public A(B b) {
        this.b = b;
        System.out.print("Ab");
    }
}

class B {
    public B() {
        System.out.print("B");
    }

    public B(int i) {
        System.out.print("Bi");
    }
}
