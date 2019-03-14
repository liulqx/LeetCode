package _009;

import java.util.ArrayList;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        x = Math.abs(x);

        ArrayList<Integer> integers = new ArrayList<>();
        int tail = 0;
        while (x != 0) {
            tail = x % 10;
            x /= 10;
            //System.out.println(tail);
            integers.add(tail);
        }
        System.out.println(integers);
        for (int i = 0; i < integers.size() && (i <= integers.size() - 1); i++) {
            if (integers.get(i) != integers.get(integers.size() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean palindrome = new Solution().isPalindrome(10);
        System.out.println(palindrome);
    }
}