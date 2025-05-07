class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            if (arr[i] == 0) {
                boolean emptyLeft = (i == 0) || (arr[i - 1] == 0);
                boolean emptyRight = (i == len - 1) || (arr[i + 1] == 0);

                if (emptyLeft && emptyRight) {
                    arr[i] = 1;
                    n--;
                    if (n == 0) return true;
                }
            }
        }

        return n <= 0;
    }
}
