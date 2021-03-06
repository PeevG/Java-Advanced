import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] parenthesis = scanner.nextLine().toCharArray();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        boolean result = true;

        for (char symbol : parenthesis) {
            switch (symbol) {
                case '(':
                    stack.push(')');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case '{':
                    stack.push('}');
                    break;
                case ')':
                case ']':
                case '}':
                    if (stack.isEmpty() || stack.poll() != symbol) {
                        result = false;
                    }
                    break;
                default:
                    break;
            }
            if (!result) {
                break;
            }

        }
        result &= stack.isEmpty();
        System.out.println(result ? "YES" : "NO");
    }
}
