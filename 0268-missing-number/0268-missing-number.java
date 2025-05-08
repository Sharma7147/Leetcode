class Solution {
    public int missingNumber(int[] arr) {
 int i=0;
        while(i<arr.length){
            if(arr[i]==arr.length){
                
                i++;
            }
            else 
            if(arr[i]!=i){
                
                int temp=arr[arr[i]];
                arr[arr[i]]=arr[i];
                arr[i]=temp;
                
            }
            else
            i++;
        }
        boolean flag=true;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j){
            
            flag=false;
            return j;
            }
        }
        return arr.length;
    }
}