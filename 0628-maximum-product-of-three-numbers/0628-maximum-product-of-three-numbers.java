class Solution {
    public int maximumProduct(int[] nums) {
int n=nums.length-1;
        Arrays.sort(nums);

        int product1=nums[n]*nums[0]*nums[1];
        int product2=nums[n]*nums[n-1]*nums[n-2];
        return  Math.max(product1,product2);
        
    }
}