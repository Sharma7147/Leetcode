class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(o -> o[1]));
        int[] current = { intervals[0][0], intervals[0][1] };
        int n = 1;

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= current[1]) {
                current[0] = intervals[i][0];
                current[1] = intervals[i][1];
                n++;

            }
        }
        return intervals.length - n;

    }
}