class Solution {
   public boolean isValidSudoku(char[][] board) {
    for (int i = 0; i < 9; i++) {
        if (!isValidRow(board, i) || !isValidColumn(board, i) || !isValidSubgrid(board, i)) {
            return false;
        }
    }
    return true;
}

private boolean isValidRow(char[][] board, int row) {
    Set<Character> set = new HashSet<>();
    for (int j = 0; j < 9; j++) {
        char current = board[row][j];
        if (current == '.') {
            continue;
        }
        if (set.contains(current)) {
            return false;
        }
        set.add(current);
    }
    return true;
}

private boolean isValidColumn(char[][] board, int col) {
    Set<Character> set = new HashSet<>();
    for (int i = 0; i < 9; i++) {
        char current = board[i][col];
        if (current == '.') {
            continue;
        }
        if (set.contains(current)) {
            return false;
        }
        set.add(current);
    }
    return true;
}

private boolean isValidSubgrid(char[][] board, int subgrid) {
    Set<Character> set = new HashSet<>();
    int rowStart = (subgrid / 3) * 3;
    int colStart = (subgrid % 3) * 3;
    for (int i = rowStart; i < rowStart + 3; i++) {
        for (int j = colStart; j < colStart + 3; j++) {
            char current = board[i][j];
            if (current == '.') {
                continue;
            }
            if (set.contains(current)) {
                return false;
            }
            set.add(current);
        }
    }
    return true;
}
}