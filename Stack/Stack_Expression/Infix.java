import java.util.Stack;

public class Infix {
    public static void main(String[] args) {
        String str = "9-5+3*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                val.push(ch - '0');
            } else if (op.isEmpty() || precedence(ch) > precedence(op.peek())) {
                op.push(ch);
            } else {
                while (!op.isEmpty() && precedence(ch) <= precedence(op.peek())) {
                    applyOperation(val, op);
                }
                op.push(ch);
            }
        }

        while (!op.isEmpty()) {
            applyOperation(val, op);
        }

        System.out.println(val.peek());
    }

    private static void applyOperation(Stack<Integer> val, Stack<Character> op) {
        char operator = op.pop();
        int v2 = val.pop();
        int v1 = val.pop();

        switch (operator) {
            case '+':
                val.push(v1 + v2);
                break;
            case '-':
                val.push(v1 - v2);
                break;
            case '*':
                val.push(v1 * v2);
                break;
            case '/':
                val.push(v1 / v2);
                break;
        }
    }

    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }
}
