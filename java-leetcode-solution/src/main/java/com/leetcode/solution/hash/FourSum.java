package com.leetcode.solution.hash;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author dongzonglei
 * @description
 * @date 2020/2/16 下午4:51
 */
public class FourSum {
    
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i -1]) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int left = j + 1;
                int right = n - 1;
                while (left < right) {
                    int tmp = nums[i] + nums[j] + nums[left] + nums[right];
                    if (tmp == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) {
                            left += 1;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right -= 1;
                        }
                        left += 1;
                        right -= 1;
                    } else if (tmp > target) {
                        right -= 1;
                    } else {
                        left += 1;
                    }
                }
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        System.out.println(fourSum(new int[]{-4,-1,-1,0,1,2}, -1));
        System.out.println(fourSum(new int[]{-3,-2,-1,0,0,1,2,3}, 0));
        System.out.println(fourSum(new int[]{-5,-5,-3,-1,0,2,4,5}, -7));
    }
}
