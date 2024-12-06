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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> l1=new ArrayList<>();
        if(root!=null){
            findPath(root,"",l1);
        }
        return l1;
        
    }
    public static void findPath(TreeNode root,String s,List<String> l1){
        if(root!=null){
            s+=root.val;
            if(root.left==null && root.right==null){
                l1.add(s);
            }else{
                s+="->";
                findPath(root.left,s,l1);
                findPath(root.right,s,l1);


            }
        }
    }
}