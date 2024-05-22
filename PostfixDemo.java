public class PostfixDemo {
    public static boolean isOperand(char c) {
        return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')
        || (c >= '0' && c <= '9') || c == ' ' || c == '.'); 
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
            case '/':
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
        StackBaru operators = new StackBaru(infix.length());
        String postfix = "";
        char c;

        for (int i = 0; i < infix.length(); i++){
            c = infix.charAt(i);

            if (isOperand(c)) {
                postfix = postfix + c;
            }
            else if (c == '(') {
                operators.push(c);
            }
            else if (c == '(') {
                while (operators.peek() != '(') {
                    postfix = postfix + operators.pop();
                }

                operators.pop();
            }
            else if (isOperator(c)){
                while (getDerajat(operators.peek()) >= getDerajat(c)) {
                    postfix = postfix + operators.pop();
                }

                operators.push(c);
            }
        }

        while (!operators.isEmpty()) {
            postfix += operators.pop();
        }

        return postfix;
    }

    public static void main(String[] args) {
        String infix = "a+b*(c-d)";
        System.out.println("Infinix: " + infix);
        System.out.println("Postfix: " + konversi(infix));
    }
}
