public class Stack {
    public int size;
    public char[] data;
    public int top;

    public Stack(int size) {
        this.size = size;
        this.data = new char[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }

    public void push(char dt) {
        if (!isFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public char pop() {
        if (!isEmpty()) {
            char temp = data[top];
            top--;
            return temp;
        } else {
            return '\0';
        }
    }

    public char peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            return '\0';
        }
    }

    public static boolean isOperand(char c) {
        return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'));
    }

    public static boolean isOperator(char c) {
        return (c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+');
    }

    public static int getDerajat(char c) {
        switch (c) {
            case '^':
                return 3;

            case '%':
                return 2;

            case '*':
                return 2;

            case '-':
                return 1;

            case '+':
                return 1;

            default:
                return 0;
        }
    }

    public static String konversi(String infix) {
        Stack operators = new Stack(infix.length());
        String postfix = "";
        char c;

        for (int i = 0; i < infix.length(); i++) {
            c = infix.charAt(i);

            if (isOperand(c)) {
                postfix = postfix + c;
            } else if (c == '(') {
                operators.push(c);
            } else if (c == ')') {
                while (operators.peek() != '\0' && operators.peek() != '(') {
                    postfix = postfix + operators.pop();
                }
                operators.pop(); // Menghapus '(' yang sesuai
            }
        }
        while (!operators.isEmpty()) {
            postfix += operators.pop();
        }
        return postfix;
    }

    public static void main(String[] args) {
        String infix = "5*4^(1+2)%3";
        System.out.println("infix: " + infix);
        System.out.println("postfix: " + konversi(infix));
    }
}
