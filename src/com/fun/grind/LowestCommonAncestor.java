package com.fun.grind;

public class LowestCommonAncestor {
    public static void main(String[] args) {

    }

    protected static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //Traverse left side if P and Q values are less than root's values
        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        }

        //Traverse right side if P and Q values are greater than root's values
        if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }

        return root;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}