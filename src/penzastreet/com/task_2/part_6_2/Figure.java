package penzastreet.com.task_2.part_6_2;

import java.util.Locale;

public abstract class Figure {
    protected float x, y;

    abstract float getArea();
    abstract float getPerimeter();

    public Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }
}

interface Moveable {
    void move(float dx, float dy);
    void resize(float koeff);
}

class Rectangle extends Figure implements Moveable {
    protected float width, height;

    public Rectangle(float x, float y, float width, float height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public float getArea() {
        return width * height;
    }

    public float getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void move(float dx, float dy) {
        x += dx;
        y += dy;
    }

    @Override
    public void resize(float koeff) {
        width *= koeff;
        height *= koeff;
    }

    public String toString() {
        return String.format(Locale.US, "Rectangle\nCenter: (%s, %s)\nHeight: %s\nWidth: %s",
                x + width / 2, y + height / 2, height, width);
    }
}

class Circle extends Figure implements Moveable {
    protected float radius;

    public Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;
    }

    public float getArea() {
        return (float)Math.PI * radius * radius;
    }

    public float getPerimeter() {
        return 2 * (float)Math.PI * radius;
    }

    @Override
    public void move(float dx, float dy) {
        x += dx;
        y += dy;
    }

    @Override
    public void resize(float koeff) {
        radius *= koeff;
    }

    public String toString() {
        return String.format(Locale.US, "Circle\nCenter: (%s, %s)\nRadius: %s", x, y, radius);
    }
}
