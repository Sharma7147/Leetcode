class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        int i = 0;
        int j = 1;
        while (i < nums.length) {

            while (j < nums.length) {
                if (nums[i] == nums[j]) {
                    if (j - i <= k)
                        return true;
                }
                else{
                    if(j-i>k)
                    break;
                }
                j++;

            }
            i++;
            j = i + 1;
        }
        return false;
    }
}