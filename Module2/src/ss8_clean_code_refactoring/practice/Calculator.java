package ss8_clean_code_refactoring.practice;

public class Calculator {

    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int fistOperand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return fistOperand + secondOperand;
            case SUBTRACTION:
                return fistOperand - secondOperand;
            case MULTIPLICATION:
                return fistOperand * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return fistOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}