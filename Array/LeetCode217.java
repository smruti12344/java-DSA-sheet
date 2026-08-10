class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>check = new HashSet<>();
        for(int i : nums){
            if(!check.add(i)){
                return true;
            }
        }
        return false;
    }
}