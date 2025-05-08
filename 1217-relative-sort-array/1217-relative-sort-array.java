class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr1) {
            list.add(num);
        }
        int k = 0;
        for (int i = 0; i < arr2.length; i++) {
            int val = arr2[i];
            for (int num : list) {
                if (arr2[i] == num) {
                    arr1[k] = num;
                    k++;

                }
            }
            list.removeIf(n -> n == val);

        }
        Collections.sort(list);
        for (int num : list) {
            arr1[k] = num;
            k++;
        }
        return arr1;
    }
}