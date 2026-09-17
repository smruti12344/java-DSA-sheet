// 4. Median of Two Sorted Arrays
// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

// The overall run time complexity should be O(log (m+n)).

 

// Example 1:

// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.
// Example 2:

// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000
// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        //called a method which merged two sorted array and return in single array
        int merg[] = mergArray(nums1,nums2);
        int length = merg.length;
        //find midan and calculate and return 
        System.out.println("length:"+length);
        int leftvalue =merg[(length-1)/2];
        int rightvalue = merg[(length/2)];
        System.out.println("left"+leftvalue+": "+"rightvalue:"+rightvalue);
        double median = (leftvalue+rightvalue)/2.0;
        return median;
    }

      int[] mergArray(int[] num1, int[] num2) {

        int m = num1.length;
        int n = num2.length;

        int[] res = new int[m + n];

        int i = 0; // pointer for num1
        int j = 0; // pointer for num2
        int k = 0; // pointer for res

        // Compare both arrays
        while (i < m && j < n) {

            if (num1[i] < num2[j]) {
                res[k] = num1[i];
                i++;
            } else {
                res[k] = num2[j];
                j++;
            }

            k++;
        }

        // Remaining elements of num1
        while (i < m) {
            res[k] = num1[i];
            i++;
            k++;
        }

        // Remaining elements of num2
        while (j < n) {
            res[k] = num2[j];
            j++;
            k++;
        }

        return res;
    }
}