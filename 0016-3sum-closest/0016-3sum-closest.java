class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int current = nums[i] + nums[left] + nums[right];

                if (Math.abs(current - target) < Math.abs(ans - target)) {
                    ans = current;
                }

                if (current < target) {
                    left++;
                } else
                    right--;
            }

        }
        return ans;
    }
}