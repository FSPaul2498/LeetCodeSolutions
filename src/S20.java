import java.util.Stack;

public class S20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') stack.push(')');
            else if (ch == '[') stack.push(']');
            else if (ch == '{') stack.push('}');
            else if (stack.empty() || ch != stack.pop()) return false;
        }
        return stack.empty();
    }
}
