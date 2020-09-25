package com.leetcode.solution;

import sun.misc.Unsafe;

/**
 * @author dongzonglei
 * @description
 * @date 2020/3/4 下午9:51
 */
public class ConvertSortedArrayToBinarySearchTree {
    
    int[] nums;
    
    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        return helper(0, nums.length - 1);
    }
    
    private TreeNode helper(int left, int right) {
        if (left > right) {
            return null;
        }
        
        int p = (left + right) / 2;
        
        TreeNode root = new TreeNode(nums[p]);
        root.left = helper(left, p - 1);
        root.right = helper(right, p + 1);
        
        return root;
    }
}
