package penzastreet.com.task_4.part_1_2;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        int low = 0, high = n - 1, key, mid, elem;
        for (int i = 0; i < k; i++) {
            key = in.nextInt();
            System.out.println((binarySearch(array, key) ? "YES" : "NO"));
        }
    }

    public static boolean binarySearch(int[] array, int key) {
        int low = 0, high = array.length - 1, mid, elem;
        while (low <= high) {
            mid = (low + high) >>> 1;
            elem = array[mid];
            if (elem == key)
                return true;
            else if (elem > key) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return false;
    }
}
