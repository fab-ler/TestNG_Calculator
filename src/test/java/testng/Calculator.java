package testng;

public class Calculator {

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return a / b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double substract(double a, double b) {
        return a - b;
    }

    // вычитание по модулю
    public double subtractModule(double a, double b) {
        if (a > b) {
            return a - b;
        }
        return b - a;
    }

    // возведение в квадрат
    public int square(int a) {
        return a * a;
    }
}
