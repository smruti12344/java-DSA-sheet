//53. Maximum Subarray

// 1.Brute force
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for(int st=0;st<nums.length;st++){
            int sum =0;
            for(int en=st;en<nums.length;en++){
                sum+=nums[en];
                if(sum>maxSum){
                    maxSum=sum;
                }

            }
        }
        return maxSum;
    }
}

//optimal
//kaadians-algorethim

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum=0;
        for(int st=0;st<nums.length;st++){
            sum+=nums[st];
            //update max_sum if sum>max_sum
            if(sum>maxSum){
                maxSum=sum;
            }
            //reset sum value to 0 if it -ve
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }
    
}