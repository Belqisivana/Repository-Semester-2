import java.util.Stack;

public class InfixEvaluator {
    public static int evaluateInfix(String infix) {
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (c == ' ') {
                continue;
            }
            else if (Character.isDigit(c)) {
                int operand = 0;
                while (i < infix.length() && Character.isDigit(infix.charAt(i))) {
                    operand = operand * 10 + Character.getNumericValue(infix.charAt(i));
                    i++;
                }
                i--; 
                operands.push(operand);
            }
            else if (c == '(') {
                operators.push(c);
            }
            else if (c == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    int operand2 = operands.pop();
                    int operand1 = operands.pop();
                    char operator = operators.pop();
                    operands.push(performOperation(operand1, operand2, operator));
                }
                operators.pop();
            }
            else {
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(c)) {
                    int operand2 = operands.pop();
                    int operand1 = operands.pop();
                    char operator = operators.pop();
                    operands.push(performOperation(operand1, operand2, operator));
                }
                operators.push(c);
            }
        }

        while (!operators.isEmpty()) {
            int operand2 = operands.pop();
            int operand1 = operands.pop();
            char operator = operators.pop();
            operands.push(performOperation(operand1, operand2, operator));
        }

        return operands.pop();
    }

    public static int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/' || operator == '%') {
            return 2;
        } else if (operator == '^') {
            return 3;
        } else {
            return -1; // Operator tidak valid
        }
    }

    public static int performOperation(int operand1, int operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            case '%':
                return operand1 % operand2;
            case '^':
                return (int) Math.pow(operand1, operand2);
            default:
                return 0; // Operator tidak valid
        }
    }

    public static void main(String[] args) {
        String infix = "5*4^(1+2)%3";
        System.out.println("Infix: " + infix);
        int hasil = evaluateInfix(infix);
        System.out.println("Hasil: " + hasil);
    }
}

