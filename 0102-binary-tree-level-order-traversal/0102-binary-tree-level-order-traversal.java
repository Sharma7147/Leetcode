class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        List<Integer> level = new ArrayList<>();

        while (!q.isEmpty()) {
            TreeNode curr = q.remove();

            if (curr == null) {
                ans.add(new ArrayList<>(level));
                level.clear();

                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                level.add(curr.val);
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
        }

        return ans;
    }
}
