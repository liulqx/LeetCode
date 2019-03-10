package _001;

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // TODO:
        int index[] = new int[2];
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    index[0] = i;
                    index[1] = j;
                    break;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int src[] = {3, 3};
        int arr[] = solution.twoSum(src, 6);
        System.out.println(Arrays.toString(arr));
    }
}
