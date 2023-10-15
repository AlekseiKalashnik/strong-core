package ua.epam.javacore.lesson_01_loops;

public class Continue {
    public static void main(String args[]) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0)
            System.out.println();
        }
    }
}
