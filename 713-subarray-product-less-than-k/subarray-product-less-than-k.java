import java.util.*;

class Solution {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0, right = 0, pro = 1, cnt = 0;
        int n = nums.length;

        if (k <= 1) return 0;

        while (right < n) {
            pro *= nums[right];

            while (pro >= k) {
                pro /= nums[left];
                left++;
            }

            cnt += right - left + 1;
            right++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        int n = ob.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = ob.nextInt();
        }

        int k = ob.nextInt();

        System.out.println(numSubarrayProductLessThanK(nums, k));
    }
}