package _013;


import java.nio.charset.CharsetEncoder;
import java.util.HashMap;
import java.util.TooManyListenersException;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 */
class Solution {
    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        int temp = 0;
        for (int i = 0; i < chars.length; i++) {
            Integer integer = map.get(chars[i]);

            if (integer == null) {
                continue;
            }
            System.out.println(chars[i]);
            //if(i<chars.length-1&& chars[i]==chars[i+1]){
            //    temp+=integer;
            //}

            //if (i == 0 || chars[i] == chars[i - 1]) {
            //    temp += integer;
            //}


            if (i < chars.length - 1 && chars[i] < chars[i + 1]) {
                if (map.get(chars[i]) < map.get(chars[i + 1])) {
                    sum -= temp = integer;
                    temp = 0;
                }
            } else if (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                if (map.get(chars[i]) < map.get(chars[i + 1])) {
                    temp += integer;
                }
            } else {
                sum += integer;
            }
        }
        System.out.println(sum);
        return 0;
    }

    public static void main(String[] args) {


        //M C M X C I V
        //+ - + - + - +
        //1000-100-1000-10+100-1+5

        //M CM XC IV
        //1000 900 90 4
        int iv = new Solution().romanToInt("MCMXCIV");
    }


}