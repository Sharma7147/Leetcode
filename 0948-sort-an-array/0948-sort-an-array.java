class Solution {
    public int[] sortArray(int[] nums) {

        quickSort(nums, 0, nums.length - 1);
        return nums;

    }

    static void quickSort(int[] arr, int low, int high) {

        if (low >= high)
            return;

        int s = low;
        int e = high;
        int m = low + (high - low) / 2;
        int pivot = arr[m];

        while (s <= e) {

            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {

                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quickSort(arr, low, e);
        quickSort(arr, s, high);

    }

}
