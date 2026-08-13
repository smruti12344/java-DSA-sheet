//Remove Duplicates from Sorted Array
//two pointer approch
class Solution {
    public int removeDuplicates(int[] nums) {
        int length =1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[length-1]){
                nums[length] = nums[i];
                length++;
            }
        }
        return length;
    }
}