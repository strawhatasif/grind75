package com.fun.grind;

public class BalancedBinaryTree {
    public static void main(String[] args) {

    }

    protected boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return height(root) != -1;
    }

    protected int height(TreeNode node) {
        if (node==null) return 0;
        var left = height(node.left);
        var right = height(node.right);
        var balanceFactor = Math.abs(left-right);

        if (balanceFactor > 1 || left == -1 || right == -1) return -1;
        return 1 + Math.max(left,right);
    }
}
