package com.leetcode.solution.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author dongzonglei
 * @description
 * @date 2019-08-21 17:26
 */
public class ValidParentheses {

    private Map<Character, Character> mapping = new HashMap<>();

    public boolean isValid(String s) {
        mapping.put(')', '(');
        mapping.put(']', '[');
        mapping.put('}', '{');

        if (s == null || s.length() == 0) {
            return true;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
        }
    }
}
