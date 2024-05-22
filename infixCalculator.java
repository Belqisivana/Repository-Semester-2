import java.util.Stack;

public class Stack {
    public int size;
    public String[] data;
    public int top;

    public Stack(int size) {
        this.size = size;
        this.data = new String[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }

    public void push(String dt) {
        if (!isFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public String pop() {
        if (!isEmpty()) {
            String temp = data[top];
            top--;
            return temp;
        } else {
            return null;
        }
    }

    public String peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            return null;
        }
    }

    public static boolean isOperand(char c) {
        return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'));
    }

    public static boolean isOperator(char c) {
        return (c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+');
    }

    public static int getPrecedence(char c) {
        switch (c) {
            case '^':
                return 3;
            case '%':
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return 0;
        }
    }

    public static String konversi(String postfix) {
        Stack String operands = new Stack();
        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);
            if (isOperand(c)) {
                operands.push(Character.toString(c));
            } else if (isOperator(c)) {
                String operand2 = operands.pop();
                String operand1 = operands.pop();
                String result = "(" + operand1 + c + operand2 + ")";
                operands.push(result);
            }
        }
        return operands.pop();
    }

    public static void main(String[] args) {
        String postfix = "54*12+^3%";
        System.out.println("postfix: " + postfix);
        System.out.println("infix: " + konversi(postfix));
    }
}
