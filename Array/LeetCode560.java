//560. Subarray Sum Equals K time complexity : O(n2)
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
}


//By using prefix

class Solution {
    public int subarraySum(int[] nums, int k) {
    int count=0;

    //calculate prefix array method
    int n= nums.length;
    int prefix[] = new int[n];
    prefix[0] = nums[0]; //1st elem to prefix array
    for(int i=1;i<n;i++){
        prefix[i] = prefix[i-1]+nums[i];
    }
    //define hash map who store frequescy of prefix array elem
    HashMap<Integer,Integer>map = new HashMap<>();
    for(int j=0;j<n;j++){
        //1st case if prefix == target elem
        if(prefix[j]==k){
            count++;
        }
        int val = prefix[j]-k;
        //find value occures in map or not if find then add the freq to count
        if(map.containsKey(val)){
            count+=map.get(val);
        }
         // Store/update frequency of current prefix sum
            map.put(prefix[j], map.getOrDefault(prefix[j], 0) + 1);
    }
    return count;
    }
}