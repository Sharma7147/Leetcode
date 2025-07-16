class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0)
            return "";

        int max = 1;
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));

        for (int i = 0; i < s.length() - 1; i++) {
            int j = i + 1;

            while ((j = findindex(s.charAt(i), s, j)) != -1) {
                int temp = checkpalindrome(i, j, s);
                if (temp > max) {
                    max = temp;
                    sb.setLength(0);
                    for (int k = i; k <= j; k++) {
                        sb.append(s.charAt(k));
                    }
                }
                j++;
            }
        }

        return sb.toString();
    }

    public static int findindex(char c, String s, int pos) {
        for (int i = pos; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }

    public static int checkpalindrome(int start, int end, String s) {
        int ans=end-start+1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return 0;
            }
            start++;
            end--;
        }
        return ans;
    }
}
