package com.leetcode.solution;

/**
 * @author dongzonglei
 * @description
 * @date 2020/2/20 下午8:16
 */
public class MaximumSubarray {
    
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            int data = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                data += nums[j];
                result = Math.max(result, data);
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        MaximumSubarray m = new MaximumSubarray();
        System.out.println(m.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(m.maxSubArray(new int[]{1}));
    }
}
