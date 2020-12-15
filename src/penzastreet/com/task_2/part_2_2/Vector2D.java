package penzastreet.com.task_2.part_2_2;

import java.util.Locale;

public class Vector2D {
    public double vX;
    public double vY;

    public static int count = 0;

    public void inc() {
        count++;
    }

    public Vector2D() {
        vX = 1;
        vY = 1;
        inc();
    }

    public Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
        inc();
    }

    public Vector2D(Vector2D vector) {
        vX = vector.vX;
        vY = vector.vY;
        inc();
    }

    public double length() {
        return Math.sqrt(Math.pow(vX, 2) + Math.pow(vY, 2));
    }

    public void add(Vector2D v) {
        vX += v.vX;
        vY += v.vY;
    }

    public void sub(Vector2D v) {
        vX -= v.vX;
        vY -= v.vY;
    }

    public void scale (double scaleFactor) {
        vX *= scaleFactor;
        vY *= scaleFactor;
    }

    public void normalized() {
        double l = length();
        vX /= l;
        vY /= l;
    }

    public double dotProduct(Vector2D v) {
        return vX * v.vX + vY * v.vY;
    }

    public void print() {
        System.out.printf(Locale.US, "(%.2f, %.2f)%n", vX, vY);
    }
}
