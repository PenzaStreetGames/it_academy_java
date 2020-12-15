package penzastreet.com.task_2.add_3;

public class Test {
    public static void main(String[] args) {
        Rect rect = new Rect(3, 6);
        rect.w = 6;
        System.out.println(rect.getW() * rect.getH() == rect.getS());
    }
}
