import java.util.Stack;

public class day17_2 {
    public static String postfixToPrefix(String postfix) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                stack.push(ch + "");
            }
            else {
                String op2 = stack.pop(); 
                String op1 = stack.pop();
                String temp = ch + op1 + op2;
                stack.push(temp);
            }
        }

        return stack.pop(); 
    }

    public static void main(String[] args) {
        String postfix1 = "AB+CD-*";
        System.out.println("Prefix: " + postfixToPrefix(postfix1)); 
        String postfix2 = "ABC/-AK/L-*";
        System.out.println("Prefix: " + postfixToPrefix(postfix2)); 
    }
}