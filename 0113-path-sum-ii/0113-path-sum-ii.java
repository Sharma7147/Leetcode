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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<Integer> path = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        getPath(root, targetSum, path, result);
        return result;

    }

    public void getPath(TreeNode root, int target, List<Integer> path, List<List<Integer>> result) {
    if (root == null)
        return;

    path.add(root.val);

    if (root.left == null && root.right == null && root.val == target)
        result.add(new ArrayList<>(path));

    getPath(root.left, target - root.val, path, result);
    getPath(root.right, target - root.val, path, result);

    path.remove(path.size() - 1);  
}

}