package _015;

import java.util.List;

/**
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * <p>
 * Note:
 * <p>
 * The solution set must not contain duplicate triplets.
 * <p>
 * Example:
 * <p>
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 * <p>
 * A solution set is:
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 *
 *
 * C63
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = i + 2; k < nums.length; k++) {
                    System.out.printf(nums[i] + "," + nums[j] + "," + nums[k] + "\n");
                    ++count;
                }
            }

        }
        System.out.println("总共：" + count);
        return null;
    }

    public static void main(String[] args) {
        new Solution().threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    }
}