//     Given an integer array nums of unique elements, return all possible subsets (the power set).

// The solution set must not contain duplicate subsets. Return the solution in any order.

// Example 1:

// Input: nums = [1,2,3]
// Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
import java.util.*;
public class Solution{
     public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(nums, 0, new ArrayList<>(), result);

        return result;
    }

     public void backtrack(int[] nums,int index,ArrayList<Integer>current,List<List<Integer>>result){
        
 // Every current list is a valid subset
        result.add(new ArrayList<>(current));

        // Try every remaining element
        for (int i = index; i < nums.length; i++) {

            // Choose
            current.add(nums[i]);

            // Explore
            backtrack(nums, i + 1, current, result);

            // Undo choice (backtrack)
            current.remove(current.size() - 1);
        }

     }
    public static void main(String args[]){
    Solution sol = new Solution();
    int nums[] ={1,2,3};
    List<List<Integer>>result = sol.subsets(nums);

    for (List<Integer> subset : result) {
    System.out.println(subset);
}

    }
}