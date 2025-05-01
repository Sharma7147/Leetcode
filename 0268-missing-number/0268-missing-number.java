class Solution {
    public int missingNumber(int[] nums) {

        Arrays.sort(nums);
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                flag = true;
                return i;

            }

        }
        if (!flag)
            return nums.length;

        return -1;
    }
}