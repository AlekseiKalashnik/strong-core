package ua.epam.javacore.lesson_08_io_exceptions_regExp;

public class ExceptionArithmeticTryCatchDemo {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println("a: " + a);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero.");
        }
    }
}
