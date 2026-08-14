//238. Product of Array Except Self

//it is calculated by prefix sum optimize 
//1.calculate prefix
//2. then sufix
//3. multiplay 
//return array
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
    int ans[] = new int[nums.length];
    //calculate suffix [1,2,3,4]
    ans[0]=1;
    for(int i=1;i<nums.length;i++){
    ans [i]=nums[i-1]*ans[i-1];
    }
    //ans[1,1,2,6]
    //calculate for sufix and return value
    System.out.println(Arrays.toString(ans));
    int sufix=1;
    for(int i=nums.length-1;i>=0;i--){
       ans[i]=sufix*ans[i];
        sufix *=nums[i];
    }
    return ans;
    }
}