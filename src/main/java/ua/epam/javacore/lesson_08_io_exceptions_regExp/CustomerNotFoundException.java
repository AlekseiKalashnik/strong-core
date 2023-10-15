package ua.epam.javacore.lesson_08_io_exceptions_regExp;

public class CustomerNotFoundException extends Exception {
    private int detail;
    CustomerNotFoundException(int a) {
        detail = a;
    }
    public String toString() {
        return "CustomerNotFoundException[" + detail + "]";
    }
}
