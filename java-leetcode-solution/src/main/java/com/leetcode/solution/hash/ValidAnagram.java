package com.leetcode.solution.hash;

import java.util.Arrays;

/**
 * @author dongzonglei
 * @description
 * @date 2020/2/15 下午10:16
 */
public class ValidAnagram {
    
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] array1 = s.toCharArray();
        char[] array2 = t.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }
}
