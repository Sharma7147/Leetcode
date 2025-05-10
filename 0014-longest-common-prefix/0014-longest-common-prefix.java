class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        StringBuilder s = new StringBuilder();
        int k = 0;

        while (true) {
        
            if (k >= strs[0].length()) {
                break;
            }

            char c = strs[0].charAt(k);

            for (int i = 1; i < strs.length; i++) {
               
                if (k >= strs[i].length() || strs[i].charAt(k) != c) {
                    return s.toString();
                }
            }

            s.append(c);
            k++;
        }

        return s.toString();
    }
}
