// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]

// sol:
// ====
// this problem solve by using Binary search approch 
// 1. define low ,high and find the mid  (mid = low+(high-low)/2);
// 2. then run binary search for first occurance and store the  index
// 3. then run binary search for second occurance and store the index
// 4. if find then retun the two index in stored array other wise return [-1,-1]
// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int result[] = {-1,-1};
        
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==target){
//                 if(result[0]==-1){
//                     result[0]=i;
//                 }
//                 result[1]=i;
//             }
//         }
//         return result;
//     }
// }


class Solution {
    public int[] searchRange(int[] nums, int target) {
         int frist = binarySearch( nums,target,true);
        int second = binarySearch(nums,target,false);

        return new int[]{frist,second};
    }

   int binarySearch(int [] nums, int target , boolean choice){
        int low =0;
        int high = nums.length-1;
        int ans =-1;

     while(low<=high){
        int mid = low+(high-low)/2;

      if(nums[mid] == target){
        ans=mid;
        
        if(choice){
            high = mid-1;
        }else{
            low =mid+1;
        }
      }
      else if(nums[mid]<target){
        low =mid+1;
      }else{
        high = mid-1;
      }

        }
        return ans;
    }
}