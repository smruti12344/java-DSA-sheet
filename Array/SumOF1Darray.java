class Solution {
    public int[] runningSum(int[] nums) {
        int val=0;
        int arr[]=new int[nums.length];
        for(int i =0;i<nums.length;i++){
            val+=nums[i];
            arr[i] =val;
        }
        return arr;
    }
} //leetcode 1480