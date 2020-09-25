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

    public boolean isValid(String s) {
        Map<Character, Character> mapping = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        mapping.put(')', '(');
        mapping.put(']', '[');
        mapping.put('}', '{');

        if (s == null || s.length() == 0) {
            return true;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mapping.containsKey(c)) {
                Character character = stack.isEmpty() ? '#' : stack.pop();
                if (character == null) {
                    return false;
                }
                if (!character.equals(mapping.get(c))) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String args[]) throws Exception {
        ValidParentheses parentheses = new ValidParentheses();
        System.out.println(parentheses.isValid("]"));
    }
}
