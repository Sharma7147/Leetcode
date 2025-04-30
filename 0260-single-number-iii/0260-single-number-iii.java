class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        int n = nums.length;
        if (n == 2)
            return nums;
        Arrays.sort(nums);
        int i = 0;
        int k = 0;
        int count = 0;
        while (i + 1 <n) {
            if (nums[i] != nums[i + 1]) {
                ans[k] = nums[i];
                count++;
                k++;
                i++;
                if (i == n - 1) {
                    ans[k] = nums[i];
                    count++;
                }
            } else {
                i += 2;
                if (i == n - 1) {
                    ans[k] = nums[i];
                    count++;
                }

            }
            if (count == 2)
                return ans;

        }
        return ans;
    }
}