class Solution {
    public int maxProfit(int[] nums) {

        int min=Integer.MAX_VALUE;
int max=0;
        for(int num:nums){

            min=Math.min(num,min);
            if(num>min){
               int val=num-min;
                max=Math.max(max,val);
            }
        }
        return max;
    }
}