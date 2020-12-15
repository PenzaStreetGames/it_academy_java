package penzastreet.com.task_2.part_6_2;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(10, 10, 1);
        Rectangle rectangle = new Rectangle(10, 10, 1, 1);
        System.out.println(circle);
        System.out.println();
        System.out.println(rectangle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        circle.resize(2);
        rectangle.resize(2);
        System.out.println(circle);
        System.out.println();
        System.out.println(rectangle);
        circle.move(2,3);
        rectangle.move(2,3);
        System.out.println(circle);
        System.out.println();
        System.out.println(rectangle);
    }
}
