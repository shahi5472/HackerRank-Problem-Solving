import java.util.Stack;

class ValidParenthesis {
    public static void main(String args[]) {
        String parenthesis = "(){}[]{";

        Stack<Character> s = new Stack<Character>();
        for (int i = 0; i < parenthesis.length(); i++) {
            if (parenthesis.charAt(i) == '(' || parenthesis.charAt(i) == '{' || parenthesis.charAt(i) == '[') {
                s.push(parenthesis.charAt(i));
            } else {
                if (s.empty()) {
                    System.out.println("invalid");
                    return;
                } else {
                    char top = (Character) s.peek();
                    if (parenthesis.charAt(i) == ')' && top == '(' ||
                            parenthesis.charAt(i) == '}' && top == '{' ||
                            parenthesis.charAt(i) == ']' && top == '[') {
                        s.pop();
                    } else {
                        System.out.println("invalid");
                        return;
                    }
                }
            }
        }
        if (s.empty()) {
            System.out.println("valid");
        } else {
            System.out.println("valid");
        }
    }
}