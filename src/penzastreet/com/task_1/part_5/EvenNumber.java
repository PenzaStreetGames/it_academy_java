package penzastreet.com.task_1.part_5;

import java.util.*;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++)
            nums[i] = in.nextInt();
        String res = (evenNum(nums) >= 2 ? "true" : "false");
        System.out.println(res);
    }

    public static int evenNum(int[] nums) {
        int res = 0;
        for (int num : nums) {
            if (num % 2 == 0)
                res++;
        }
        return res;
    }
}
