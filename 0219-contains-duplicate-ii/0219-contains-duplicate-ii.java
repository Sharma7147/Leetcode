class Solution {
    public boolean containsNearbyDuplicate(int[] a, int k) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length && j <= i + k; j++) {
                if (a[i] == a[j]) {
                    return true;
                }
            }
        }
        return false;

    }
}
