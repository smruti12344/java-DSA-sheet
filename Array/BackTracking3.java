// Grid Paths from Top to Bottom Corner
// Solved
// Difficulty: EasyAccuracy: 64.94%Submissions: 14K+Points: 2Average Time: 10m
// Given an n x m matrix mat[][], find all possible paths from the top-left cell (0, 0) to the bottom-right cell (n-1, m-1).

// From each cell, movement is restricted to two directions:

// Right → (i, j+1)
// Down → (i+1, j)
// Return all possible paths, where each path is represented as a list of matrix elements encountered along the way.

// Examples:

// Input: mat[][] = [[1, 2, 3], [4, 5, 6]]
// Output: [[1, 4, 5, 6], [1, 2, 5, 6], [1, 2, 3, 6]]
// Explanation: There are 3 possible paths from cell (0,0) to (1,2).


class Solution {
    public ArrayList<ArrayList<Integer>> allPaths(int[][] mat) {
        // code here
        ArrayList<ArrayList<Integer>>result = new ArrayList<>();
        ArrayList<Integer>path = new ArrayList<>();
        findPath(mat, 0,0,path,result);
        return result;
    }
    
    public void findPath(int[][]mat,int row,int col,ArrayList<Integer>path,ArrayList<ArrayList<Integer>>result){
       
       int n = mat.length;
       int m = mat[0].length;
       //add(0,0)elemt to path
       path.add(mat[row][col]);
       //Base case
       if(row== n-1 && col== m-1){
           //store the path
          result.add(new ArrayList<>(path));
           //remove the current elemnt to path
           path.remove(path.size()-1);
           return;
           
       }
       
        //1st choice is go down
        if(row+1<n){
            findPath(mat,row+1,col,path,result);
        }
        // 2nd chioce is go right
        if(col+1<m){
            findPath(mat,row,col+1,path,result);
        }
        // 5. Backtrack
        path.remove(path.size() - 1);
    }
}