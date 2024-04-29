
import java.util.*;

class sumEqual
{
    public int[] tosum(int[] nums, int target) {
        int result[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String s[]) {
        Scanner sn = new Scanner(System.in);
        int r = sn.nextInt();
        int nums[] = new int[r];
        for (int i = 0; i < r; i++) {
            nums[i] = sn.nextInt();
        }
        int target = sn.nextInt();
        sumEqual s1 = new sumEqual();
        int result[] = s1.tosum(nums, target);
        System.out.println("[" + result[0] + " " + result[1] + "]");
    }
}

