package com.leetcode.solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author dongzonglei
 * @description
 * @date 2020/2/22 下午5:33
 */
public class AssignCookies {
    
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int result = 0;
        for (int i : s) {
            if (i > g[result]) {
                result++;
                if (result >= g.length) {
                    return result;
                }
            }
        }
        return result;
    }
}
