import java.util.*;

public class BalancedParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String expr = sc.nextLine();
        
        if (isBalanced(expr)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not balanced");
        }
        sc.close();
    }
    
    static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : expr.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
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
}