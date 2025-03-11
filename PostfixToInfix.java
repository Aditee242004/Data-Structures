import java.util.Stack;

public class PostfixToInfix {
    
    public static String convert(String postfix) {
        Stack<String> stack = new Stack<>();
        
        for (char ch : postfix.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                stack.push(String.valueOf(ch));
            } else {
                System.out.println("Before pop: Top element is " + stack.peek());
                // Pop two operands
                String operand2 = stack.pop();
                String operand1 = stack.pop();

                // Form new expression and push it back to stack
                String newExpr = "(" + operand1 + " " + ch + " " + operand2 + ")";
                stack.push(newExpr);
            }
        }
        
        // Final expression in stack is the result
        return stack.pop();

    }

    public static void main(String[] args) {
        String postfix = "ab+c*d-";
        System.out.println("Postfix Expression: " + postfix);
        System.out.println("Infix Expression: " + convert(postfix));
    }
}
