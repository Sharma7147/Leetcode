class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for (int pile : piles) {
            high = Math.max(pile, high);

        }

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long hours = check(piles, mid);
            if (hours <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;

    }

    public static long check(int[]piles,int k){
        long result=0;
        for(int pile:piles){

        result+=((long)(pile) + k-1)/k;
        }
        return result;
    }
}