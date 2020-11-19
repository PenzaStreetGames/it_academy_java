package penzastreet.com.task_1.add_2;

import java.util.Scanner;

public class Treasure {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String direction = in.nextLine();
        int step, x = 0, y = 0, length = 0;
        while (!direction.equals("")) {
            length = direction.length();
            switch (direction.substring(0, 5)) {
                case "North":
                    step = Integer.parseInt(direction.substring(6, length).trim());
                    y += step;
                    break;
                case "East ":
                    step = Integer.parseInt(direction.substring(5, length).trim());
                    x += step;
                    break;
                case "South":
                    step = Integer.parseInt(direction.substring(6, length).trim());
                    y -= step;
                    break;
                case "West ":
                    step = Integer.parseInt(direction.substring(5, length).trim());
                    x -= step;
                    break;
            }
            direction = in.nextLine();
        }
        System.out.println(x + " " + y);
    }
}
