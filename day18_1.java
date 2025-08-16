import java.util.Stack;

public class day18_1 {
    public boolean secretCodeofBrackets(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty(); 
    }

    public static void main(String[] args) {
        day18_1 obj = new day18_1();

        System.out.println(obj.secretCodeofBrackets("()"));       
        System.out.println(obj.secretCodeofBrackets("()[]{}"));   
        System.out.println(obj.secretCodeofBrackets("(]"));       
        System.out.println(obj.secretCodeofBrackets("([)]"));     
        System.out.println(obj.secretCodeofBrackets("{[]}"));     
    }
}
