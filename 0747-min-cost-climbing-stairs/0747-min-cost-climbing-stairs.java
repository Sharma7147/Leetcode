class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] value = new int[n];

        value[0] = cost[0];
        value[1] = cost[1];

        for (int i = 2; i < n; i++) {
            value[i] = cost[i] + Math.min(value[i - 1], value[i - 2]);
        }

        
        return Math.min(value[n - 1], value[n - 2]);
    }
}
