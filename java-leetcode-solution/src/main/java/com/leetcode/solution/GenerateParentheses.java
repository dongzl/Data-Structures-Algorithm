package com.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dongzonglei
 * @description
 * @date 2020/2/22 下午10:23
 */
public class GenerateParentheses {
    
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateOneByOne("", result, n, n);
        return result;
    }
    
    private void generateOneByOne(String s, List<String> result, int left, int right) {
        if (left == 0 && right == 0) {
            result.add(s);
            return;
        }
        if (left > 0) {
            generateOneByOne(s + "(", result, left - 1, right);
        }
        if (right > left) {
            generateOneByOne(s + ")", result, left, right - 1);
        }
    }
}
