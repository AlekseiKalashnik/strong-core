package ua.epam.javacore.lesson_08_io_exceptions_regExp;

public class ThrowsDemo {
    static void throwOne()
            throws IllegalAccessException {
        System.out.println("Inside throwOne.");
        throw new IllegalAccessException("demo");
    }

    public static void main(String args[]) throws IllegalAccessException {
        throwOne();
    }
}
