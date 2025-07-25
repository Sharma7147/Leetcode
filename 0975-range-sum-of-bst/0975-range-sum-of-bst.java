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
    public int rangeSumBST(TreeNode root, int low, int high) {
        return sum(root, low, high);
    }

    public int sum(TreeNode root, int low, int high) {
        if (root == null)
            return 0;

        if (root.val < low) {

            return sum(root.right, low, high);

        } else if (root.val > high) {

            return sum(root.left, low, high);
            
        } else {

            return root.val + sum(root.left, low, high) + sum(root.right, low, high);
        }
    }
}
