package com.leetcode.solution.tree;

/**
 * @author dongzonglei
 * @description
 * @date 2020/2/17 下午9:00
 */
public class ValidateBinarySearchTree {
    
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }
    
    private boolean helper(TreeNode node, Integer lower, Integer upper) {
        if (node == null) {
            return true;
        }
        int val = node.val;
        if (lower != null && val <= lower) {
            return false;
        }
        if (upper != null && val >= upper) {
            return false;
        }
        if (!helper(node.right, val, upper)) {
            return false;
        }
        if (!helper(node.left, lower, val)) {
            return false;
        }
        return true;
    }
    
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
}
