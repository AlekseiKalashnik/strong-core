package ua.epam.javacore.lesson_03_oop;

public interface IA {
    default void test(){
        System.out.println("IA");
    }
}
