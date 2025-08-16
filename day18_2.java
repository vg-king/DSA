import java.util.Stack;

public class day18_2 {

    public int evalPostfix(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int b = stack.pop(); 
                int a = stack.pop(); 

                int result = 0;
                switch (token) {
                    case "+": result = a + b; break;
                    case "-": result = a - b; break;
                    case "*": result = a * b; break;
                    case "/": result = a / b; break;
                }

                stack.push(result); 
            } else {
                
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop(); 
    }

    public static void main(String[] args) {
        day18_2 evaluator = new day18_2();

        String[] example1 = {"2", "3", "1", "*", "+", "9", "-"};
        System.out.println("Output: " + evaluator.evalPostfix(example1)); 

        String[] example2 = {"100", "200", "+", "2", "/", "5", "*", "7", "+"};
        System.out.println("Output: " + evaluator.evalPostfix(example2)); 
    }
}
