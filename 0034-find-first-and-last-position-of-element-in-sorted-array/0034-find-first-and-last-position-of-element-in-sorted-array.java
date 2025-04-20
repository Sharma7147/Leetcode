class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        boolean flag = false;
        int[] ans = new int[2];
        int[] ans1 = {-1, -1};
        int i = 0;

        while (i < n && !flag) {
            if (nums[i] == target) {
                flag = true;
                ans[0] = i;
                break;
            }
            i++;
        }

        if (!flag) return ans1;

        while (i < n && nums[i] == target) {
            i++;
        }
        ans[1] = i - 1;

        return ans;
    }
}
