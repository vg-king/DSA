import java.util.Stack;

public class day17_1 {
    public static String magicStackMirror(String str){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            st.push(c);
        }
        StringBuilder newString = new StringBuilder();
        while (!st.isEmpty()) {
            newString.append(st.pop());
        }
        return newString.toString();
    }
    public static void main(String[] args) {
        String str = "A man a plan a canal Panama";
        String str1 = "%$#@!";
       System.out.println(magicStackMirror(str));
       System.out.println(magicStackMirror(str1));
    }
}
