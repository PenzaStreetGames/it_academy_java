package penzastreet.com.task_2.test;

abstract class Figure {
    public abstract String draw();
}

class Circle extends Figure{
    public String draw(){
        return "draw_circle";
    }
}

class Rectangle extends Figure{
    public String draw(){
        return "draw_rectangle";
        }
}

public class Solution{
    public static void main(String[] args){
        double var = Double.MAX_VALUE;
        System.out.println(var);
    }
}
