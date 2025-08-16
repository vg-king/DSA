import java.util.ArrayList;
import java.util.List;

public class GenreateParenthisi {
    class Solution {
        private void generate(int n, int open, int close, String current, List<String> result) {
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }
      if (open < n) {
            generate(n, open + 1, close, current + "(", result);
        }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();

    }
    class Solution1 {
    public boolean isPowerOfTwo(int n) {
        if((n & n-1 )== 0) return true;
        return false;

    }
}
}
    public static void main(String[] args) {
        
    }
}
