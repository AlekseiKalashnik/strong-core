package ua.epam.javacore.lesson_01_loops;

public class While {
    public static void main(String args[]) {
        int n = 10;
        while (n > 0) {
            System.out.println("tick " + n--);
        }
    }
}
