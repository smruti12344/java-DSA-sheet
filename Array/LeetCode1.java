//Two Sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        //this can be solve by using 2 approch
        // 1.2-pointer approch
        //2. Hashing

        // 1.2-pointer approch
        // frist store the value and index in 2-d array
        // then sort this array
        // and applied 2-pointer approch
        int arr[][] = new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            arr[i][0]=nums[i]; //values store
            arr[i][1]=i; //store the index

        }

        //sort the array based on value wtih index
       Arrays.sort(arr,(a,b)-> Integer.compare(a[0],b[0]));
       //define si and ei 
        int si = 0;
        int ei = nums.length-1;
        while(si<ei){
            int sum =arr[si][0]+arr[ei][0];
            if(sum==target){
             return new int[]{arr[si][1],arr[ei][1]};
            }
             if(sum >target){
                ei--;
            }else{
                si++;
            }
        }
        return new int[]{};
    }
}


////2. Hashing

class Solution {
    public int[] twoSum(int[] nums, int target) {
        //this can be solve by using 2 approch
        // 1.2-pointer approch
        //2. Hashing
    // then run a loop and minus value from target and find the value present in map if present then return index 
    //otherwise store in map
    HashMap<Integer,Integer>map = new HashMap<>();
    for(int i=0;i<nums.length;i++){
        int needed = target-nums[i];
        if(map.containsKey(needed)){
            return new int[]{map.get(needed),i};
        }
        map.put(nums[i],i);
    }
    return new int[]{};
    }
}