package com.leetcode.solution.recursion;

/**
 * @author dongzonglei
 * @description
 * @date 2019-08-29 18:40
 */
public class LongestUnivaluePath {

    private int max = 0;

    public int longestUnivaluePath(TreeNode root) {
        find(root);
        return max;
    }

    int find(TreeNode root) {
        if (root == null) {
            return 0;
        }
        System.out.println("root.left:" + root.left.val);
        System.out.println("root.right:" + root.right.val);
        int left = find(root.left);
        int right = find(root.right);
        left = (root.left != null && root.left.val == root.val) ? left + 1 : 0;
        right = (root.right != null && root.right.val == root.val) ? right + 1: 0;
        max = Math.max(max, left + right);
        return Math.max(left, right);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String args[]) throws Exception {
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(5);
        TreeNode t4 = new TreeNode(1);
        TreeNode t5 = new TreeNode(1);
        TreeNode t6 = new TreeNode(5);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.right = t6;
        LongestUnivaluePath path = new LongestUnivaluePath();
        System.out.println(path.longestUnivaluePath(t1));
    }
}
