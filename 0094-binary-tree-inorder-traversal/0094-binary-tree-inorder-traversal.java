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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;

        inOrder(root, ans);
        return ans;

    }

    public void inOrder(TreeNode root, ArrayList ans) {
        if (root == null)
            return;

        inOrder(root.left, ans);
        ans.add(root.val);
        inOrder(root.right, ans);
    }
}