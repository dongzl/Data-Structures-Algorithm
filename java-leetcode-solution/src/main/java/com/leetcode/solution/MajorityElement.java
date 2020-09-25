package com.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dongzonglei
 * @description
 * @date 2020/2/20 下午5:59
 */
public class MajorityElement {
    
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            Integer counter = map.getOrDefault(num, 0);
            map.put(num, counter + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        MajorityElement e = new MajorityElement();
        System.out.println(e.majorityElement(new int[]{3,2,3}));
    }
}
