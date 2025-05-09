class Solution {
    public String restoreString(String s, int[] indices) {
        String[] arr = new String[indices.length];

        for (int i = 0; i < s.length(); i++) {
            arr[indices[i]] = String.valueOf(s.charAt(i)); 
        }

        return String.join("", arr);
    }
}
