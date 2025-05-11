class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
  int[]ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=findElement(nums[i],nums,i);
        }
          return ans;
    }

    public static int findElement(int target,int[]arr,int k){

        
        

        for(int i=k+1;i<arr.length;i++){
            if(arr[i]>target){
                return arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>target){
                return arr[i];
            }
        }

        return -1;

    }
  
}