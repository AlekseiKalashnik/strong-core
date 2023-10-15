package ua.epam.javacore.lesson_08_io_exceptions_regExp;

public class CustomerNotFoundExceptionDemo {
    static String findCustomerById(int id) throws CustomerNotFoundException{
        if (id == 1) {
            System.out.println("Customer details...");
            return "T";
        }
        throw new CustomerNotFoundException(id);
    }

    public static void main(String args[]) {
        try {
            findCustomerById(1);
            findCustomerById(4);
        } catch (CustomerNotFoundException e) {
            e.printStackTrace();
        }

    }
}
