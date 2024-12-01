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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null)return false;
        if(subRoot==null)return true;
        return isSame(root,subRoot)||isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
        
    }
    public static boolean isSame(TreeNode T,TreeNode S){
        if(T==null && S==null)return true;
        if(T==null || S==null)return false;
        return T.val==S.val &&isSame(T.left,S.left)&&isSame(T.right,S.right);
    }
}