package calculate;

public class Calculator {
    public int addition(int a, int b) {
        int result = a + b;
        System.out.println();
        return result;
    }

    public int subtraction(int a, int b) {
        int result = a - b;
        System.out.println();
        return result;
    }

    public int division(int a, int b) {
        int result = a / b;
        System.out.println();
        return result;
    }

    public int multiplication(int a, int b) {
        int result = a * b;
        System.out.println();
        return result;
    }

    public void calculateResult(int a, int b, char symbol) {
        if (symbol == '+') {
            addition(a,b);
            System.out.println("Addition of " + a + " and " + b + " is " + addition(a, b));
        } else if (symbol == '-') {
            System.out.println("Subtraction of " + a + " and " + b + " is " + subtraction(a, b));
        } else if (symbol == '/') {
            System.out.println("Division of " + a + " and " + b + " is " + division(a, b));
        } else if (symbol == '*') {
            System.out.println("Multiplication of " + a + " and " + b + " is " + multiplication(a, b));
        } else {
            System.out.println("Invalid arithmetic symbol");
        }
    }

}
