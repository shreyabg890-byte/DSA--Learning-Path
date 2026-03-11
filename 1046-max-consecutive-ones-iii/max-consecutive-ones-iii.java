import java.util.Scanner;

public class Solution {

    public static int longestOnes(int[] nums, int k) {
        int i = 0, j = 0;

        while (j < nums.length) {

            if (nums[j] == 0) {
                k--;
            }

            if (k < 0) {
                if (nums[i] == 0) {
                    k++;
                }
                i++;
            }

            j++;
        }

        return j - i;
    }

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);

        int n = ob.nextInt();     // size of array
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = ob.nextInt();
        }

        int k = ob.nextInt();

        System.out.println(longestOnes(nums, k));
    }
}