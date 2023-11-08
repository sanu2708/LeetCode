class Solution {
   public boolean exist(char[][] board, String word) {
    int m = board.length;
    int n = board[0].length;
    
    // Define a visited array to keep track of visited cells
    boolean[][] visited = new boolean[m][n];
    
    // Iterate through the grid and search for the word
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (dfs(board, word, i, j, 0, visited)) {
                return true;
            }
        }
    }
    
    return false;
}

private boolean dfs(char[][] board, String word, int i, int j, int index, boolean[][] visited) {
    if (index == word.length()) {
        return true; // All characters in the word have been found
    }
    
    if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] || board[i][j] != word.charAt(index)) {
        return false; // Out of bounds or visited, or not a matching character
    }
    
    visited[i][j] = true; // Mark the current cell as visited
    
    // Recursively search for the word in all four directions
    boolean result = dfs(board, word, i - 1, j, index + 1, visited) ||
                    dfs(board, word, i + 1, j, index + 1, visited) ||
                    dfs(board, word, i, j - 1, index + 1, visited) ||
                    dfs(board, word, i, j + 1, index + 1, visited);
    
    visited[i][j] = false; // Mark the current cell as not visited after backtracking
    
    return result;
}
}