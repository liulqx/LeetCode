package _014;

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        //System.out.println(Arrays.toString(strs));
        if (strs == null || strs.length == 0) {
            return "";
        }
        String str0 = strs[0];
        String prefix = "";
        for (int i = 0; i < str0.length(); i++) {
            prefix = str0.substring(0, i + 1);
            System.out.println(prefix);
            for (int j = 0; j < strs.length; j++) {
                //String test = strs[j].substring(0, i + 1);
                if (prefix.length() > strs[j].length() || !prefix.equals(strs[j].substring(0, i + 1))) {
                    return str0.substring(0, i);
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        //String s = new Solution().longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        String s = new Solution().longestCommonPrefix(new String[]{"aa", "a"});
        System.out.println("result:" + s);
        //System.out.println("ojbk".contains("jb"));
        //System.out.println("flower".substring(0,6));
    }
}