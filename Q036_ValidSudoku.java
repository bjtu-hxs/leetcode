import java.util.HashSet;

public class Q036_ValidSudoku {
    // Method_01  26ms  81.52%
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> column = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                // traverse each line
                if (board[i][j] != '.' && !row.add(board[i][j])) {
                    return false;
                }
                // traverse each column
                if (board[j][i] != '.' && !column.add(board[j][i])) {
                    return false;
                }
            }
        }

        // traverse each 3x3 sub-box
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (containsDuplicate1(board, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean containsDuplicate1(char[][] board, int i, int j) {
        HashSet<Character> subBox = new HashSet<>();
        for (int k = i; k < i + 3; k++) {
            for (int l = j; l < j + 3; l++) {
                if (board[k][l] != '.' && !subBox.add(board[k][l])) {
                    return true;
                }
            }
        }
        return false;
    }
}
