class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
int[]ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=findElement(nums1[i],nums2);
        }
          return ans;
    }

    public static int findElement(int target,int[]arr){

        int j;
        for(j=0;j<arr.length;j++){
            if(target==arr[j])
            break;
        }
        

        for(int i=j+1;i<arr.length;i++){
            if(arr[i]>target){
                return arr[i];
            }
        }
        return -1;

    }
  
}