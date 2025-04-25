import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num); 
        }

        for (int i = 1; i <= arr.length; i++) {
            if (!set.contains(i)) {
                ans.add(i); 
            }
        }

        return ans;
    }
}
