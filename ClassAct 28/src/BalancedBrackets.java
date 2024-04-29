import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check for balanced brackets:");
        String input = scanner.nextLine();
        boolean result = isBalanced(input);
        if (result) {
            System.out.println("The brackets are balanced.");
        } else {
            System.out.println("The brackets are not balanced.");
        }
        scanner.close();
    }
}
class BalancedBracketsTester {
    public static void main(String[] args) {
        System.out.println("Testing BalancedBrackets:");
        System.out.println(BalancedBrackets.isBalanced("[()]{}"));
        System.out.println(BalancedBrackets.isBalanced("[(])"));
        System.out.println(BalancedBrackets.isBalanced("{[()]}"));
        System.out.println(BalancedBrackets.isBalanced("{[(])}"));
        System.out.println(BalancedBrackets.isBalanced("(()"));
        System.out.println(BalancedBrackets.isBalanced(")()"));    
    }
}

class BalancedAllBrackets {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check for balanced brackets:");
        String input = scanner.nextLine();

        boolean result = isBalanced(input);
        if (result) {
            System.out.println("The brackets are balanced.");
        } else {
            System.out.println("The brackets are not balanced.");
        }
        scanner.close();
    }
}

