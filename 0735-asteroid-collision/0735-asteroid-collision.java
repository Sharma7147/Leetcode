class Solution {
    public int[] asteroidCollision(int[] n) {
        Stack<Integer> st = new Stack<>();

        int i = 0;
        while (i < n.length) {
            if (n[i] > 0 || st.isEmpty() || st.peek() < 0) {
                st.push(n[i]);
                i++;
            } else if (st.peek() + n[i] == 0) {
                st.pop();
                i++;
            } else if (st.peek() + n[i] < 0) {
                st.pop();
            } else {
                i++;
            }
        }

        int[] ans = new int[st.size()];
        for (int j = st.size() - 1; j >= 0; j--) {
            ans[j] = st.pop();
        }

        return ans;
    }
}
