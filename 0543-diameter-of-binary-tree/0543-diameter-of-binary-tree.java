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
class info{

    int dm;
    int ht;

   public info(int dm,int ht){
    this.dm=dm;
    this.ht=ht;
   }
}

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {

        if (root == null)
            return 0;

        int ld = diameterOfBinaryTree(root.left);
        int rd = diameterOfBinaryTree(root.right);
        int hd = height(root.left) + height(root.right) ;

        return Math.max(Math.max(ld, rd), hd) ;

    }
    

    public int height(TreeNode root) {
        if (root == null)
            return 0;

        return Math.max(height(root.left), height(root.right)) + 1;
    }
}