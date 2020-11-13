package penzastreet.com.task_1.part_11;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), level = 0, number = 1;
        int[][] matrix = new int[2 * n + 1][2 * n + 1];
        int x = n, y = n;
        while (level <= n) {
            int direction = choose_direction(matrix, x, y, n);
            while(direction != 0) {
                if (direction == 1)
                    x -= 1;
                if (direction == 2)
                    y -= 1;
                if (direction == 3)
                    x += 1;
                if (direction == 4)
                    y += 1;
                matrix[x][y] = number;
                number++;
                direction = choose_direction(matrix, x, y, n);
            }
            x -= 1;
            if (level < n) {
                matrix[x][y] = number;
                number++;
            }
            level++;
        }
        for (int i = 0; i < 2 * n + 1; i++) {
            for (int j = 0; j < 2 * n + 1; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static String format(int number) {
        String str;
        if (number < 10)
            str = "  ";
        else if (number < 100)
            str = " ";
        else
            str = "";
        return str + number;
    }

    public static int distance(int x, int y, int n) {
        int dist_x = Math.abs(n - x);
        int dist_y = Math.abs(n - y);
        return (Math.max(dist_x, dist_y));
    }

    public static boolean exists(int x,  int y, int n) {
        return (x >= 0 && x < 2 * n + 1 && y >= 0 && y < 2 * n + 1);
    }

    public static int choose_direction(int[][] matrix, int x, int y, int n) {
        if (exists(x - 1, y, n)) {
            if (matrix[x - 1][y] == 0 && distance(x, y, n) == distance(x - 1, y, n))
                return 1;
        }
        if (exists(x, y - 1, n)) {
            if (matrix[x][y - 1] == 0 && distance(x, y, n) == distance(x, y - 1, n))
                return 2;
        }
        if (exists(x + 1, y, n)) {
            if (matrix[x + 1][y] == 0 && distance(x, y, n) == distance(x + 1, y, n))
                return 3;
        }
        if (exists(x, y + 1, n)) {
            if (matrix[x][y + 1] == 0 && distance(x, y, n) == distance(x, y + 1, n))
                return 4;
        }
        return 0;
    }
}
