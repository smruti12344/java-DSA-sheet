//912. Sort an Array
// Given an array of integers nums, sort the array in ascending order and return it.

// You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.

 

// Example 1:

// Input: nums = [5,2,3,1]
// Output: [1,2,3,5]
// Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).

class Solution {

    void merge(int arr[], int st, int mid, int end) {

        int i = st;
        int j = mid + 1;

        int temp[] = new int[end - st + 1];
        int k = 0;

        // Merge both sorted halves
        while (i <= mid && j <= end) {

            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Remaining elements from left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Remaining elements from right half
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // Copy temp back to original array
        for (int index = 0; index < temp.length; index++) {
            arr[st + index] = temp[index];
        }
    }

    void mergSort(int arr[], int st, int end) {

        if (st < end) {

            int mid = st + (end - st) / 2;

            // Divide
            mergSort(arr, st, mid);
            mergSort(arr, mid + 1, end);

            // Merge
            merge(arr, st, mid, end);
        }
    }

    public int[] sortArray(int[] nums) {

        mergSort(nums, 0, nums.length - 1);

        return nums;
    }
}