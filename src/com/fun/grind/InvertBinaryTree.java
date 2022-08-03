package com.fun.grind;

public class InvertBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        invertTree(root);
    }

    protected static TreeNode invertTree(TreeNode root) {
        //Nothing to invert! Return a null
        if (root == null) return null;

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        //This is where the inversion occurs
        root.right = left;
        root.left = right;

        return root;
    }


    // A node contains the value, left and right pointers
    // Definition for a binary tree node.
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }
    }
}

