class Solution {
    public int countHomogenous(String s) {
        long count = 0;
        long mod = 1_000_000_007;
        int n = s.length();
        int i = 0;

        while (i < n) {
            char currentChar = s.charAt(i);
            int length = 0;

            
            while (i < n && s.charAt(i) == currentChar) {
                i++;
                length++;
            }

            count = (count + ((long) length * (length + 1) / 2)) % mod;
        }

        return (int) count;
    }
}
