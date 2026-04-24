import java.util.*;

public class Main {
    public static boolean canJump(int[] nums) {
        int maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxIndex) {
                return false;
            }
            maxIndex = Math.max(maxIndex, i + nums[i]);
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(canJump(nums));
    }
}