package penzastreet.com.task_1.part_5;

import java.util.*;

public class InvNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int nums[] = new int[4];
        for (int i = 0; i < 4; i++)
            nums[i] = in.nextInt();
        String res = (IsInverted(nums) ? "true" : "false");
        System.out.println(res);
    }

    public static boolean IsInverted(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == -nums[j])
                    return true;
            }
        }
        return false;
    }
}
