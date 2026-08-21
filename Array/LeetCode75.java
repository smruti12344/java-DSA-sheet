// //75. Sort Colors
// Example 1:

// Input: nums = [2,0,2,1,1,0]

// Output: [0,0,1,1,2,2]

// Explanation:

// The array has two 0s, two 1s, and two 2s. Sorting them in-place places all 0s first, then all 1s, then all 2s.
class Solution {
   public static void swap(int i,int j,int[]nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j]= temp;
    }
    //this is the dutch national flag processs
    public void sortColors(int[] nums) {
        // 1.sortting process
        // Arrays.sort(nums);

        // Dutch national flag process
        int n = nums.length;
        int low =0,mid=0,high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
             swap(low,mid,nums);
             low++;
             mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }else{
                swap(mid,high,nums);
                high--;
            }
        }
    }
}