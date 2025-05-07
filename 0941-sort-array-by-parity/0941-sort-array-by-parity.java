class Solution {
    public int[] sortArrayByParity(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        int[] ans = new int[nums.length];
        int i = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                ans[i] = num;
                i++;

            } else {
                list.add(num);
            }
        }
        if (i == ans.length)
            return ans;
        int k = 0;
        for (int j = i; j < nums.length; j++) {
            ans[j] = list.get(k);
            k++;
        }
        return ans;
    }
}