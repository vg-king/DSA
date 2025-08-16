import java.util.Stack;

public class Depth {
    class Solution {
        public int maxDepth(String s) {
            int count = 0;
            int maxCount = 0;
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (i == '(' && j == '(') {
                        count++;
                        maxCount = Math.max(maxCount, count);
                    } else {
                        count = 0;
                    }
                }
            }
            return maxCount;
        }
    }

    public static void main(String[] args) {

        String c = "abc";
        c = (String)(c+1);
        System.out.println(c);

        char x='A';
        x=(char) (x+1);
        System.out.println(x);
     

    }

}