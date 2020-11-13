package penzastreet.com.task_1.part_11;

import java.util.*;

public class DiagonalMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] matrix = new int[100][100];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n - j - 1)
                    matrix[i][j] = 1;
                else if (i < n - j - 1)
                    matrix[i][j] = 0;
                else
                    matrix[i][j] = 2;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
