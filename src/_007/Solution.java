package _007;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 123
 * Output: 321
 * Example 2:
 * <p>
 * Input: -123
 * Output: -321
 * Example 3:
 * <p>
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only store integers
 * within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose
 * of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
class Solution {
    public int reverse(int x) {
        int origin=x;
        List<Integer> list = new ArrayList<>();
        int t = 0;
        while (x != x / 10) {
            t = x % 10;
            list.add(t);
            //System.out.println(t);
            x /= 10;
        }

        double result = 0;
        for (int i = 0; i < list.size(); i++) {
            double v = list.get(i) * Math.pow(10, list.size() - i - 1);
            result +=Math.abs(v);
            System.out.println(v);
        }
        System.out.println(result);
        if(result>Integer.MAX_VALUE){
            result=0;
        }

        if(origin<=0){
            result*=-1.0;
        }
        return (int)result;
    }

    public static void main(String[] args) {
        //new Solution().reverse(789);
        //int reverse = new Solution().reverse(1534236469);
        //int reverse = new Solution().reverse(-2147483648);
        int reverse = new Solution().reverse(123);
        System.out.println(reverse);
    }

    //public static void main(String[] args) {
    //    System.out.println(Math.pow(2,31) );
    //}

    //public static void main(String[] args) {
    //    int a = 1534236469;
    //    //int a = 9646324351;
    //    System.out.println(a);
    // }
}