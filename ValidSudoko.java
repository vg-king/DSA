import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> occur = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j]=='.') {
                    continue;
                }
                occur.add(board[i][j]);
            }
        }
        
        for (int i = 0; i < 9; i++) {
            Set<Character> occur = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j]=='.') {
                    continue;
                }
                if (occur.contains(board[i][j])) {
                    return false;
                }
                occur.add(board[i][j]);
            }
        }
        for (int i = 0; i < 9; i++) {
            Set<Character> occur = new HashSet<>();
            for (int j = 0; j < 3; j++) {
                for (int j2 = 0; j2 < 3; j2++) {
                    int row = (i/3)*3+i;
                    int col = (i%3)*3+j;
                    if(board[row][col]=='.') continue;
                    if(occur.contains(board[row][col])) return false;
                    occur.add(board[row][col]);
                }
            }
        }
        return true;

    }
}
public class ValidSudoko {
    
}
