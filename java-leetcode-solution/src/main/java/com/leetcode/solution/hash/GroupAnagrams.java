package com.leetcode.solution.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dongzonglei
 * @description
 * @date 2020/2/16 下午7:10
 */
public class GroupAnagrams {
    
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map  = new HashMap<>();
        for (String s : strs) {
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            List<String> list = map.getOrDefault(new String(temp), new ArrayList<>());
            list.add(s);
            map.put(new String(temp), list);
        }
        return new ArrayList<>(map.values());
    }
    
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}
