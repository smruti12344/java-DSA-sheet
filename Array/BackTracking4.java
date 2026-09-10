// Given a binary matrix maze[][] of size n × n containing values 0 and 1, find all possible paths for a rat to travel from the source cell (0, 0) to the destination cell (n - 1, n - 1). The rat can move in four directions: up(U), down(D), left(L), and right(R).

// 1 represents an open cell through which the rat can move.
// 0 represents a blocked cell that cannot be traversed.
// The rat can move only through open cells and cannot visit the same cell more than once in a path. Return all valid paths as strings consisting of 'U', 'D', 'L', and 'R', representing the sequence of moves taken by the rat.

// Note: Return the paths in lexicographically increasing order. If no valid path exists, return an empty list.

// Examples:

// Input: maze[][] = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}}
// Output: ["DDRDRR", "DRDDRR"]
// Explanation: There are two valid paths from the source cell (0, 0) to the destination cell (3, 3).
// Input: maze[][] = [[1, 0], [1, 0]]
// Output: []
// Explanation: No path exists as the destination cell (1, 1) is blocked.

class Solution {

    public ArrayList<String> ratInMaze(int[][] maze) {

        ArrayList<String> paths = new ArrayList<>();

        boolean[][] visited =
            new boolean[maze.length][maze[0].length];

        findPath(maze, 0, 0, paths, visited, "");

        return paths;
    }

    public void findPath(
        int[][] maze,
        int row,
        int col,
        ArrayList<String> paths,
        boolean[][] visited,
        String path
    ) {

        int n = maze.length;
        int m = maze[0].length;

        // Invalid cell
        if (row < 0 || row >= n ||
            col < 0 || col >= m ||
            maze[row][col] == 0 ||
            visited[row][col]) {

            return;
        }

        // Destination
        if (row == n - 1 && col == m - 1) {
            paths.add(path);
            return;
        }

        // Choose
        visited[row][col] = true;

        // D
        findPath(maze, row + 1, col,
                 paths, visited, path + "D");

        // L
        findPath(maze, row, col - 1,
                 paths, visited, path + "L");

        // R
        findPath(maze, row, col + 1,
                 paths, visited, path + "R");

        // U
        findPath(maze, row - 1, col,
                 paths, visited, path + "U");

        // Backtrack
        visited[row][col] = false;
    }
}