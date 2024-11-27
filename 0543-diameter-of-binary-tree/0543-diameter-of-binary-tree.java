/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        return diameterHelper(root).diameter;
    }

    // Helper function to calculate diameter and height
    private TreeInfo diameterHelper(TreeNode root) {
        if (root == null) {
            return new TreeInfo(0, 0); // Height = 0, Diameter = 0 for null node
        }

        // Recursively calculate the height and diameter of left and right subtrees
        TreeInfo left = diameterHelper(root.left);
        TreeInfo right = diameterHelper(root.right);

        // Height of the current node
        int height = Math.max(left.height, right.height) + 1;

        // Diameter of the current node is the sum of left and right heights
        int diameter = Math.max(left.height + right.height, Math.max(left.diameter, right.diameter));

        return new TreeInfo(height, diameter);
    }

    // A utility class to store the height and diameter
    private static class TreeInfo {
        int height;
        int diameter;

        TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }
}
